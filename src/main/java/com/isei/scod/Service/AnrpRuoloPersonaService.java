package com.isei.scod.Service;


import com.isei.scod.DTO.AnrpRuoloPersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnrpRuolopersona;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.AnrpRuoloPersonaMapper;
import com.isei.scod.Repository.AnrpRuoloPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnrpRuoloPersonaService {

    @Autowired
    AnrpRuoloPersonaMapper anrpRuoloPersonaMapper;

    @Autowired
    AnrpRuoloPersonaRepository anrpRuoloPersonaRepository;

    public AnrpRuoloPersonaDTO getAnrpRuoloPersonaById(Integer id) throws NotFoundException {

        Optional<AnrpRuolopersona> entity =  anrpRuoloPersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnpePersona.class, id );

        return anrpRuoloPersonaMapper.fromAnrpRuoloPersonaEntityToDTO(entity.get());

    }




}
