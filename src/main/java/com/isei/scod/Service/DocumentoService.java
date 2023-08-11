package com.isei.scod.Service;

import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.DocumentoMapper;
import com.isei.scod.Repository.AndoDocumentoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    AndoDocumentoRepository documentoRepository;

    @Autowired
    DocumentoMapper documentoMapper;

    public Boolean saveAndoDocumento(@Valid DocumentoDTO dto) {

        AndoDocumento entity = documentoMapper.fromAndoDocumentoDTOToEntity(dto);
        entity = documentoRepository.save(entity);

        return true;

    }

    public DocumentoDTO getAndoDocumentoByAndoSysuser(String andoSysuser) throws NotFoundException {

        Optional<AndoDocumento> entity = documentoRepository.findByAndoSysuser(andoSysuser);

        if (!entity.isPresent())
            throw new NotFoundException(AltaTipodocumento.class, andoSysuser);

        return documentoMapper.fromAndoDocumentoEntitytoDTO(entity.get());
    }


}
