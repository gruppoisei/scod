package com.isei.scod.Mapper;

import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.Entity.AltaTipodocumento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TipoDocumentoMapper {

    TipoDocumentoDTO fromAltaTipoDocumentoEntityToDTO(AltaTipodocumento entity);

    AltaTipodocumento fromAltaTipoDocumentoDTOToEntity(TipoDocumentoDTO dto);

}
