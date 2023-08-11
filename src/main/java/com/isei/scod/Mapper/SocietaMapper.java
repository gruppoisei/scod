package com.isei.scod.Mapper;

import com.isei.scod.DTO.AnsoSocietaDTO;
import com.isei.scod.DTO.TipoDocumentoDTO;
import com.isei.scod.DTO.TipoSocietaDTO;
import com.isei.scod.Entity.AnsoSocieta;
import com.isei.scod.Entity.AntsTipoSocieta;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SocietaMapper {

    AnsoSocietaDTO fromAnsoSocietaEntityToDTO(AnsoSocieta entity);

    AnsoSocieta fromAnsoSocietaDTOToEntity(AnsoSocietaDTO dto);

    TipoSocietaDTO fromTipoSocietaEntityToDTO (AntsTipoSocieta entity);

    AntsTipoSocieta fromTipoSocietaDTOToEntity (TipoDocumentoDTO dto);


}
