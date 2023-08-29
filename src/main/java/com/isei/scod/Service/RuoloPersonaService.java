package com.isei.scod.Service;


import com.isei.scod.DTO.RuoloPersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnrpRuolopersona;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.RuoloPersonaMapper;
import com.isei.scod.Repository.AnrpRuoloPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RuoloPersonaService {

    @Autowired
    RuoloPersonaMapper ruoloPersonaMapper;

    @Autowired
    AnrpRuoloPersonaRepository anrpRuoloPersonaRepository;

    public RuoloPersonaDTO getAnrpRuoloPersonaById(Integer id) throws NotFoundException {

        Optional<AnrpRuolopersona> entity =  anrpRuoloPersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnpePersona.class, id );

        return ruoloPersonaMapper.fromAnrpRuoloPersonaEntityToDTO(entity.get());

    }


}
