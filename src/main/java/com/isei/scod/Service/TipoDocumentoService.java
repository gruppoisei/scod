package com.isei.scod.Service;

import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.TipoDocumentoMapper;
import com.isei.scod.Repository.AltaTipoDocumentoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoDocumentoService {

    @Autowired
    AltaTipoDocumentoRepository altaTipoDocumentoRepository;

    @Autowired
    TipoDocumentoMapper tipoDocumentoMapper;

    private static final String ALTATIPODOCUMENTO = "ALTA TIPO DOCUMENTO";

    public Boolean saveTipoDocumento(@Valid TipoDocumentoDTO dto) {

        AltaTipodocumento entity = tipoDocumentoMapper.fromAltaTipoDocumentoDTOToEntity(dto);

        entity = altaTipoDocumentoRepository.save(entity);

        return true;

    }

    public TipoDocumentoDTO geTipoDocumentoById(Integer id) throws NotFoundException {

        Optional<AltaTipodocumento> entity =  altaTipoDocumentoRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(ALTATIPODOCUMENTO, id );

        return tipoDocumentoMapper.fromAltaTipoDocumentoEntityToDTO(entity.get());

    }

}
