package com.isei.scod.Service;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.PersonaLoginDTO;
import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.DTO.RuoloPersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnrpRuolopersona;
import com.isei.scod.Entity.AnruRuolo;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.PersonaMapper;
import com.isei.scod.Mapper.RuoloMapper;
import com.isei.scod.Repository.AnpePersonaRepository;
import com.isei.scod.Repository.AnrpRuoloPersonaRepository;
import com.isei.scod.Repository.AnruRuoloRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    PersonaMapper personaMapper;

    @Autowired
    AnpePersonaRepository anpePersonaRepository;

    @Autowired
    AnrpRuoloPersonaRepository ruoloPersonaRepository;

    @Autowired
    AnruRuoloRepository ruoloRepository;

    @Autowired
    RuoloMapper ruoloMapper;


    public Boolean saveAnpePersona(@Valid PersonaDTO dto) {

        AnpePersona entity = personaMapper.fromAnpePersonaDTOToEntity(dto);

        entity = anpePersonaRepository.save(entity);

        return true;

    }

    public PersonaLoginDTO getPersonaById(Integer id) throws NotFoundException {

        Optional<AnpePersona> entity =  anpePersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnpePersona.class, id );

        PersonaLoginDTO dto = personaMapper.fromAnpePersonaEntityToPersonaLoginDTO(entity.get());

        dto.setRuoli(getRuoloPersonaById(id));


        return dto;

    }

    public List<RuoloDTO> getRuoloPersonaById(Integer id) throws NotFoundException {

        List<AnrpRuolopersona> ruolopersonaList =  ruoloPersonaRepository.findByIdPersona(id);

        if(ruolopersonaList.isEmpty())
            throw new NotFoundException(AnrpRuolopersona.class, AnpePersona.class, id);

        List<AnruRuolo> ruoloList = new ArrayList<>();

        for(AnrpRuolopersona ruolopersona : ruolopersonaList)

            if (ruoloRepository.findById(ruolopersona.getAnrpFkAnruRuoloid().getId()).isPresent())
                ruoloList.add(ruoloRepository.findById(ruolopersona.getAnrpFkAnruRuoloid().getId()).get());


        return ruoloMapper.fromListAnruRuoloEntitytoDTO(ruoloList);

    }



}
