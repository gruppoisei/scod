package com.isei.scod.Service;

import com.isei.scod.DTO.DocumentipersonaDTO;
import com.isei.scod.DTO.DocumentisocietaDTO;
import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import com.isei.scod.Entity.AndfDocumentisocieta;
import com.isei.scod.Entity.AndoDocumento;
import com.isei.scod.Entity.AndpDocumentipersona;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.DocumentoMapper;
import com.isei.scod.Repository.AltaTipoDocumentoRepository;
import com.isei.scod.Repository.AndfDocumentisocietaRepository;
import com.isei.scod.Repository.AndoDocumentoRepository;
import com.isei.scod.Repository.AndpDocumentiPersonaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentoService {

    @Autowired
    AndoDocumentoRepository documentoRepository;

    @Autowired
    AndpDocumentiPersonaRepository documentiPersonaRepository;

    @Autowired
    AndfDocumentisocietaRepository documentisocietaRepository;

    @Autowired
    AltaTipoDocumentoRepository tipoDocumentoRepository;

    @Autowired
    DocumentoMapper documentoMapper;

    public Boolean saveDocumento(@Valid DocumentoDTO dto) {

        AndoDocumento entity = documentoMapper.fromAndoDocumentoDTOToEntity(dto);
        entity = documentoRepository.save(entity);

        return true;

    }

    public DocumentoDTO getDocumentoByAndoSysuser(String andoSysuser) throws NotFoundException {

        Optional<AndoDocumento> entity = documentoRepository.findByAndoSysuser(andoSysuser);

        if (!entity.isPresent())
            throw new NotFoundException(AltaTipodocumento.class, andoSysuser);

        return documentoMapper.fromAndoDocumentoEntitytoDTO(entity.get());
    }

    public Boolean saveDocumentoPersona(@Valid DocumentipersonaDTO dto) {

        AndpDocumentipersona entity = documentoMapper.fromAndpDocumentipersonaDTOToEntity(dto);
        entity = documentiPersonaRepository.save(entity);

        return true;

    }

    public Boolean saveDocumentoSocieta(@Valid DocumentisocietaDTO dto) {

        AndfDocumentisocieta entity = documentoMapper.fromAndfDocumentisocietaDTOToEntity(dto);
        entity = documentisocietaRepository.save(entity);

        return true;

    }

    public Boolean saveTipoDocumento(@Valid TipoDocumentoDTO dto) {

        AltaTipodocumento entity = documentoMapper.fromAltaTipodocumentoDTOToEntity(dto);
        entity = tipoDocumentoRepository.save(entity);

        return true;

    }

    public DocumentipersonaDTO getDoc(Integer id) throws NotFoundException {

        Optional<AndpDocumentipersona> entity = documentiPersonaRepository.findById(id);

        return documentoMapper.fromAndpDocumentipersonaEntitytoDTO(entity.get());
    }

}
