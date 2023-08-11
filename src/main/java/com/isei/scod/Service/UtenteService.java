package com.isei.scod.Service;

import com.isei.scod.ConfigSecurity.PasswordEncoder;
import com.isei.scod.DTO.RegisterDTO;
import com.isei.scod.Entity.SyutUtente;
import com.isei.scod.Mapper.UtenteMapper;
import com.isei.scod.Repository.SyutUtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    SyutUtenteRepository syutUtenteRepository;

    @Autowired
    UtenteMapper utenteMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public Boolean registerUser(RegisterDTO registerDTO) {
        SyutUtente newUser = utenteMapper.fromRegisterDTOToUtente(registerDTO);
        newUser.setSyutDataAbilitazione(LocalDate.now());
        newUser.setSyutPasswordHash(passwordEncoder.getPasswordEncoder().encode(newUser.getSyutPasswordHash()));
        syutUtenteRepository.save(newUser);
        return true;
    }

    public Optional<SyutUtente> getUser(String user) {

        return syutUtenteRepository.findBySyutUserName(user);

    }

}
