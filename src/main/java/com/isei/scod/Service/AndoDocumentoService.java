package com.isei.scod.Service;

import com.isei.scod.DTO.AndoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.AndoDocumentoMapper;
import com.isei.scod.Repository.AndoDocumentoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AndoDocumentoService {

    @Autowired
    AndoDocumentoRepository andoDocumentoRepository;

    @Autowired
    AndoDocumentoMapper andoDocumentoMapper;

    public Boolean saveAndoDocumento(@Valid AndoDocumentoDTO dto) {

        AndoDocumento entity = andoDocumentoMapper.fromAndoDocumentoDTOToEntity(dto);
        entity = andoDocumentoRepository.save(entity);

        return true;

    }

    public AndoDocumentoDTO getAndoDocumentoByAndoSysuser(String andoSysuser) throws NotFoundException {

        Optional<AndoDocumento> entity = andoDocumentoRepository.findByAndoSysuser(andoSysuser);

        if (!entity.isPresent())
            throw new NotFoundException(AltaTipodocumento.class, andoSysuser);

        return andoDocumentoMapper.fromAndoDocumentoEntitytoDTO(entity.get());
    }


}
