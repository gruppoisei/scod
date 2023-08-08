package com.isei.scod.Service;

import com.isei.scod.ConfigSecurity.SecurityConfig;
import com.isei.scod.DTO.RegisterDTO;
import com.isei.scod.DTO.UserDetailDTO;
import com.isei.scod.Entity.SyutUtente;
import com.isei.scod.Mapper.UtenteMapper;
import com.isei.scod.Repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UtenteService {

    @Autowired
    UtenteRepository utenteRepository;

    @Autowired
    UtenteMapper utenteMapper;


    @Autowired
    BCryptPasswordEncoder passwordEncoder;



    public Boolean registerUser(RegisterDTO registerDTO) {
        SyutUtente newUser = utenteMapper.fromRegisterDTOToUtente(registerDTO);
        newUser.setAnutDataAbilitazione(LocalDate.now());
        newUser.setAnutPasswordHash(passwordEncoder.encode(newUser.getAnutPasswordHash()));
        utenteRepository.save(newUser);
        return true;
    }
}
