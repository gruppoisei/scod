package com.isei.scod.Service;

import com.isei.scod.DTO.SysaStatoAbilitazioneDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.SysaStatoAbilitazione;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.SysaStatoAbilitazioneMapper;
import com.isei.scod.Repository.SysaStatoAbilitazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SysaStatoAbilitazioneService {

    @Autowired
    SysaStatoAbilitazioneRepository sysaStatoAbilitazioneRepository;

    @Autowired
    SysaStatoAbilitazioneMapper sysaStatoAbilitazioneMapper;

    public SysaStatoAbilitazioneDTO getSysaStatoAbilitazioneById(Integer id) throws NotFoundException {

        Optional<SysaStatoAbilitazione> entity =  sysaStatoAbilitazioneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AltaTipodocumento.class, id );

        return sysaStatoAbilitazioneMapper.fromSysaStatoAbilitazioneEntitytoDTO(entity.get());

    }
}
