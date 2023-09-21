package com.isei.scod.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.PersonaAnagraficaDTO;
import com.isei.scod.DTO.PersonaRegisterDTO;
import com.isei.scod.DTO.RuoloDTO;
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
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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
    
    private static final String ANPEPERSONA = "ANPE PERSONA";
    private static final String ANRPRUOLOPERSONA = "ANRP RUOLO PERSONA";
    


    public Boolean saveAnpePersona(@Valid PersonaDTO dto) {

        AnpePersona entity = personaMapper.fromAnpePersonaDTOToEntity(dto);

        entity = anpePersonaRepository.save(entity);

        return true;

    }

    public AnpePersona savePersona(@Valid PersonaDTO dto) {

        AnpePersona entity = personaMapper.fromAnpePersonaDTOToEntity(dto);

        return anpePersonaRepository.save(entity);

    }

    public PersonaAnagraficaDTO getPersonaAnagraficaDTOById(Integer id) throws NotFoundException {

        Optional<AnpePersona> entity =  anpePersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ANPEPERSONA, id );

        PersonaAnagraficaDTO dto = personaMapper.fromAnpePersonaEntityToPersonaAnagraficaDTO(entity.get());

        dto.setRuoli(getRuoloPersonaById(id));


        return dto;

    }

    public PersonaDTO getPersonaDTOById(Integer id) throws NotFoundException {

        Optional<AnpePersona> entity =  anpePersonaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ANPEPERSONA, id );

        PersonaDTO dto = personaMapper.fromAnpePersonaEntityToPersonaDTO(entity.get());

        return dto;

    }

    public List<RuoloDTO> getRuoloPersonaById(Integer id) throws NotFoundException {

        List<AnrpRuolopersona> ruolopersonaList =  ruoloPersonaRepository.findByIdPersona(id);

        if(ruolopersonaList.isEmpty())
            throw new NotFoundException(ANRPRUOLOPERSONA, ANPEPERSONA, id);

        List<AnruRuolo> ruoloList = new ArrayList<>();

        for(AnrpRuolopersona ruolopersona : ruolopersonaList)

            if (ruoloRepository.findById(ruolopersona.getAnrpFkAnruRuoloid().getId()).isPresent())
                ruoloList.add(ruoloRepository.findById(ruolopersona.getAnrpFkAnruRuoloid().getId()).get());


        return ruoloMapper.fromListAnruRuoloEntitytoDTO(ruoloList);

    }

    public Boolean disattivaPersona(Integer idPersona) {

        anpePersonaRepository.setFlagAttivaFalse(idPersona);

        return true;
    }

    public Boolean convertAndSavePersonaDTO(String persona, List<MultipartFile> file) {

        PersonaRegisterDTO dto = getJson(persona, file);

        //map
        // save su tab persona

        return true;

    }

    public PersonaRegisterDTO getJson(String persona, List<MultipartFile> file) {

        PersonaRegisterDTO dto = new PersonaRegisterDTO();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            dto = objectMapper.readValue(persona, PersonaRegisterDTO.class);

        } catch(IOException e) {
            e.printStackTrace();
        }

        dto.setAnpeCertificazioni(file.get(0));
        dto.setAnpeCv(file.get(1));
        dto.setAnpeDocumento(file.get(2));
        dto.setAnpeCvAziendale(file.get(3));
        dto.setAnpeTitoliStudio(file.get(4));

        return dto;

    }

}
