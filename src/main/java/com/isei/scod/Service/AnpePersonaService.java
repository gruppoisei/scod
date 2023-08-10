package com.isei.scod.Service;

import com.isei.scod.DTO.AnpePersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.AnpePersonaMapper;
import com.isei.scod.Repository.AnpePersonaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnpePersonaService {

    @Autowired
    AnpePersonaMapper anpePersonaMapper;

    @Autowired
    AnpePersonaRepository anpePersonaRepository;



    public Boolean saveAnpePersona(@Valid AnpePersonaDTO dto) {

        AnpePersona entity = anpePersonaMapper.fromAnpePersonaDTOToEntity(dto);

        entity = anpePersonaRepository.save(entity);

        return true;

    }

    public AnpePersonaDTO getAnpePersonaById(Integer id) throws NotFoundException {

        Optional<AnpePersona> entity =  anpePersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnpePersona.class, id );

        return anpePersonaMapper.fromAnpePersonaEntityToDTO(entity.get());

    }



}
