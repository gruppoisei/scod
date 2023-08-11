package com.isei.scod.Service;

import com.isei.scod.DTO.StatoAbilitazioneDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.SysaStatoAbilitazione;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.StatoAbilitazioneMapper;
import com.isei.scod.Repository.SysaStatoAbilitazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatoAbilitazioneService {

    @Autowired
    SysaStatoAbilitazioneRepository sysaStatoAbilitazioneRepository;

    @Autowired
    StatoAbilitazioneMapper statoAbilitazioneMapper;

    public StatoAbilitazioneDTO getSysaStatoAbilitazioneById(Integer id) throws NotFoundException {

        Optional<SysaStatoAbilitazione> entity =  sysaStatoAbilitazioneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AltaTipodocumento.class, id );

        return statoAbilitazioneMapper.fromSysaStatoAbilitazioneEntitytoDTO(entity.get());

    }
}
