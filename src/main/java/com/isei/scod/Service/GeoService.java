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
    GepaPaeseRepository gepaPaeseRepository;

    @Autowired
    GecoComuneRepository gecoComuneRepository;

    @Autowired
    GetoToponimoRepository getoToponimoRepository;

    @Autowired
    GeprProvinciaRepository geprProvinciaRepository;

    @Autowired
    GereRegioneRepository gereRegioneRepository;

    @Autowired
    GeagAreaGeograficaRepository geagAreaGeograficaRepository;

    @Autowired
    GeoMapper geoMapper;

    private static final String GEPAPAESE = "GEPA PAESE";
    private static final String GEPACOMUNE = "GEPA COMUNE";
    private static final String GETOTOPONIMO = "GETO TOPONIMO";
    private static final String GEPRPROVINCIA = "GEPR PROVINCIA";
    private static final String GEREREGIONE = "GERE REGIONE";
    private static final String GEAGAREAGEOGRAFICA = "GEAG AREA GEOGRAFICA";

    public PaeseDTO getPaeseById(Integer id) throws NotFoundException {

        Optional<GepaPaese> entity =  gepaPaeseRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GEPAPAESE, id );

        return geoMapper.fromPaeseEntityToDTO(entity.get());

    }

    public ComuneDTO getComuneById(Integer id) throws NotFoundException {

        Optional<GecoComune> entity = gecoComuneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GEPACOMUNE, id);

        return geoMapper.fromComuneEntitytoDTO(entity.get());
    }

    public ToponimoDTO getToponimoById(String  toponimo) throws NotFoundException {

        Optional<GetoToponimo> entity = getoToponimoRepository.findById(toponimo);

        if (!entity.isPresent())
            throw new NotFoundException(GETOTOPONIMO, toponimo);

        return geoMapper.fromToponimoEntitytoDTO(entity.get());
    }

    public ProvinciaDTO getProvinciaById(Integer id) throws NotFoundException {

        Optional<GeprProvincia> entity = geprProvinciaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GEPRPROVINCIA, id);

        return geoMapper.fromProvinciaEntityToDTO(entity.get());
    }

    public RegioneDTO getRegioneById(Integer id) throws NotFoundException {

        Optional<GereRegione> entity = gereRegioneRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GEREREGIONE, id);

        return geoMapper.fromRegioneEntityToDTO(entity.get());
    }

    public AreaGeograficaDTO getAreaGeograficaById(Integer id) throws NotFoundException {

        Optional<GeagAreaGeografica> entity = geagAreaGeograficaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(GEAGAREAGEOGRAFICA, id);

        return geoMapper.fromAreaGeograficaEntityToDTO(entity.get());
    }

    }

