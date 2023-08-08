package com.isei.scod.Mapper;


import com.isei.scod.DTO.AndoDocumentoDTO;
import com.isei.scod.Entity.AndoDocumento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AndoDocumentoMapper {

    AndoDocumentoDTO fromAndoDocumentoEntitytoDTO(AndoDocumento entity);

    AndoDocumento fromAndoDocumentoDTOToEntity(AndoDocumentoDTO dto);

}
