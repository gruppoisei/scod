package com.isei.scod.Service;

import com.isei.scod.ConfigSecurity.PasswordEncoder;
import com.isei.scod.DTO.RegisterUserDTO;
import com.isei.scod.DTO.RegisterUserPersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.SyutUtente;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.UtenteMapper;
import com.isei.scod.Repository.SyutUtenteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    SyutUtenteRepository syutUtenteRepository;

    @Autowired
    UtenteMapper utenteMapper;

    @Autowired
    PersonaService personaService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private static final String SYUTUTENTE = "SYUT UTENTE";


    public Boolean registerUser(@Valid RegisterUserDTO registerUserDTO) {
        SyutUtente newUser = utenteMapper.fromRegisterDTOToUtente(registerUserDTO);
        newUser.setSyutDataAbilitazione(LocalDate.now());
        newUser.setSyutPasswordHash(passwordEncoder.getPasswordEncoder().encode(newUser.getSyutPasswordHash()));
        syutUtenteRepository.save(newUser);
        return true;
    }

    @Transactional
    public Boolean disattivaUtentePersona(Integer idUser) throws NotFoundException {

        Optional<SyutUtente> utente = syutUtenteRepository.findById(idUser);

        utente.orElseThrow(() -> new NotFoundException(SYUTUTENTE, idUser));

        syutUtenteRepository.setFlagAttivaFalse(idUser);


        personaService.disattivaPersona(utente.get().getSyutFkPersPersonaid());

        return true;
    }

    @Transactional
    public Boolean registerUserPersona(RegisterUserPersonaDTO register) {

        AnpePersona isPersonaSaved = personaService.savePersona(register.getPersonaDTO());
        if(isPersonaSaved == null)
            throw new RuntimeException("errore nel salvataggio");
        register.getUserDTO().setSyutFkPersPersonaid(isPersonaSaved.getId());
        Boolean isUserSaved = registerUser(register.getUserDTO());


        if(!isUserSaved)
            throw new RuntimeException("errore nel salvataggio");

        return true;
    }


    public Optional<SyutUtente> getUser(String user) {

        return syutUtenteRepository.findBySyutUserName(user);

    }

}
