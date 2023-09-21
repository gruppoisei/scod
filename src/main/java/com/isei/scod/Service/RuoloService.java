package com.isei.scod.Service;

import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.AnruRuolo;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.RuoloMapper;
import com.isei.scod.Repository.AnruRuoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RuoloService {

    @Autowired
    AnruRuoloRepository anruRuoloRepository;

    @Autowired
    RuoloMapper ruoloMapper;

    private static final String ALTATIPODOCUMENTO = "ALTA TIPO DOCUMENTO";

    public RuoloDTO getAnruRuoloById(Integer id) throws NotFoundException {

        Optional<AnruRuolo> entity =  anruRuoloRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ALTATIPODOCUMENTO, id );

        return ruoloMapper.fromAnruRuoloEntitytoDTO(entity.get());

    }


}
