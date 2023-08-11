package com.isei.scod.Service;

import com.isei.scod.DTO.ComuneDTO;
import com.isei.scod.DTO.PaeseDTO;
import com.isei.scod.Entity.GecoComune;
import com.isei.scod.Entity.GepaPaese;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.GeoMapper;
import com.isei.scod.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GeoService {

    @Autowired
    PaeseRepository paeseRepository;

    @Autowired
    ComuneRepository comuneRepository;

    @Autowired
    ToponimoRepository toponimoRepository;

    @Autowired
    ProvinciaRepository provinciaRepository;

    @Autowired
    RegioneRepository regioneRepository;

    @Autowired
    AreaGeograficaRepository areaGeograficaRepository;

    @Autowired
    GeoMapper geoMapper;

    public PaeseDTO getPaeseById(Integer id) throws NotFoundException {

        Optional<GepaPaese> entity =  paeseRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GepaPaese.class, id );

        return geoMapper.fromPaeseEntityToDTO(entity.get());

    }

    public ComuneDTO getComuneById(Integer id) throws NotFoundException {

        Optional<GecoComune> entity = comuneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GecoComune.class, id);

        return geoMapper.fromComuneEntitytoDTO(entity.get());
    }
    }

