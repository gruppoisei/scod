package com.isei.scod.Service;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.PersonaMapper;
import com.isei.scod.Repository.AnpePersonaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    PersonaMapper personaMapper;

    @Autowired
    AnpePersonaRepository anpePersonaRepository;



    public Boolean saveAnpePersona(@Valid PersonaDTO dto) {

        AnpePersona entity = personaMapper.fromAnpePersonaDTOToEntity(dto);

        entity = anpePersonaRepository.save(entity);

        return true;

    }

    public PersonaDTO getAnpePersonaById(Integer id) throws NotFoundException {

        Optional<AnpePersona> entity =  anpePersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnpePersona.class, id );

        return personaMapper.fromAnpePersonaEntityToDTO(entity.get());

    }



}
