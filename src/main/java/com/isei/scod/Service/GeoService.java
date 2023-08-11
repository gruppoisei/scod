package com.isei.scod.Service;

import com.isei.scod.DTO.*;
import com.isei.scod.Entity.*;
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

    public ToponimoDTO getToponimoById(String  toponimo) throws NotFoundException {

        Optional<GetoToponimo> entity = toponimoRepository.findById(toponimo);

        if (!entity.isPresent())
            throw new NotFoundException(GetoToponimo.class, toponimo);

        return geoMapper.fromToponimoEntitytoDTO(entity.get());
    }

    public ProvinciaDTO getProvinciaById(Integer id) throws NotFoundException {

        Optional<GeprProvincia> entity = provinciaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GeprProvincia.class, id);

        return geoMapper.fromProvinciaEntityToDTO(entity.get());
    }

    public RegioneDTO getRegioneById(Integer id) throws NotFoundException {

        Optional<GereRegione> entity = regioneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GereRegione.class, id);

        return geoMapper.fromRegioneEntityToDTO(entity.get());
    }

    public AreaGeograficaDTO getAreaGeograficaById(Integer id) throws NotFoundException {

        Optional<GeagAreaGeografica> entity = areaGeograficaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GeagAreaGeografica.class, id);

        return geoMapper.fromAreaGeograficaEntityToDTO(entity.get());
    }

    }

