package com.isei.scod.Service;

import com.isei.scod.DTO.AnsoSocietaDTO;
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

    public Boolean saveAnsoSocieta(@Valid AnsoSocietaDTO dto) {

        AnsoSocieta entity = societaMapper.fromAnsoSocietaDTOToEntity(dto);

        entity = ansoSocietaRepository.save(entity);

        return true;

    }

    public AnsoSocietaDTO getAnsoSocietaById(Integer id) throws NotFoundException {

        Optional<AnsoSocieta> entity =  ansoSocietaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AnsoSocieta.class, id );

        return societaMapper.fromAnsoSocietaEntityToDTO(entity.get());

    }

    public TipoSocietaDTO getTipoSocietaById(Integer id) throws NotFoundException {

        Optional<AntsTipoSocieta> entity =  antsTipoSocietaRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(AntsTipoSocieta.class, id );

        return societaMapper.fromTipoSocietaEntityToDTO(entity.get());

    }
}
