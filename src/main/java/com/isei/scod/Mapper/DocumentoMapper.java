package com.isei.scod.Mapper;


import com.isei.scod.DTO.DocumentoDTO;
import com.isei.scod.Entity.AndoDocumento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DocumentoMapper {

    DocumentoDTO fromAndoDocumentoEntitytoDTO(AndoDocumento entity);

    AndoDocumento fromAndoDocumentoDTOToEntity(DocumentoDTO dto);

}
