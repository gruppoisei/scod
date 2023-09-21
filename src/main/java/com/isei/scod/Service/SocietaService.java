package com.isei.scod.Service;

import com.isei.scod.DTO.SocietaDTO;
import com.isei.scod.DTO.TipoSocietaDTO;
import com.isei.scod.Entity.AnsoSocieta;
import com.isei.scod.Entity.AntsTipoSocieta;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.SocietaMapper;
import com.isei.scod.Repository.AnsoSocietaRepository;
import com.isei.scod.Repository.AntsTipoSocietaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SocietaService {

    @Autowired
    SocietaMapper societaMapper;

    @Autowired
    AnsoSocietaRepository ansoSocietaRepository;

    @Autowired
    AntsTipoSocietaRepository antsTipoSocietaRepository;

    private static final String ANSOSOCIETA = "ANSO SOCIETA";
    private static final String ANTSTIPOSOCIETA = "ANTS TIPO SOCIETA";


    public Boolean saveAnsoSocieta(@Valid SocietaDTO dto) {

        AnsoSocieta entity = societaMapper.fromAnsoSocietaDTOToEntity(dto);

        entity = ansoSocietaRepository.save(entity);

        return true;

    }

    public SocietaDTO getAnsoSocietaById(Integer id) throws NotFoundException {

        Optional<AnsoSocieta> entity =  ansoSocietaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ANSOSOCIETA, id );

        return societaMapper.fromAnsoSocietaEntityToDTO(entity.get());

    }

    public TipoSocietaDTO getTipoSocietaById(Integer id) throws NotFoundException {

        Optional<AntsTipoSocieta> entity =  antsTipoSocietaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ANTSTIPOSOCIETA, id );

        return societaMapper.fromTipoSocietaEntityToDTO(entity.get());

    }
}
