package com.isei.scod.Service;

import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.TipoDocumentoMapper;
import com.isei.scod.Repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoDocumentoService {

    @Autowired
    TipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    TipoDocumentoMapper tipoDocumentoMapper;

    public Boolean saveTipoDocumento(TipoDocumentoDTO dto) {

        AltaTipodocumento entity = tipoDocumentoMapper.fromAltaTipoDocumentoDTOToEntity(dto);

        entity = tipoDocumentoRepository.save(entity);

        return true;

    }

    public TipoDocumentoDTO geTipoDocumentoById(Integer id) throws NotFoundException {

        Optional<AltaTipodocumento> entity =  tipoDocumentoRepository.findById(id);

        if (!entity.isPresent())
            throw new NotFoundException(" Alta Tipo Documento Entity non trovata per id:",id );

        return tipoDocumentoMapper.fromAltaTipoDocumentoEntityToDTO(entity.get());

    }

}
