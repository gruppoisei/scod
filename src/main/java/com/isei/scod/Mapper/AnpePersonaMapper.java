package com.isei.scod.Mapper;

import com.isei.scod.DTO.AnpePersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnpePersonaMapper {

    AnpePersonaDTO fromAnpePersonaEntityToDTO(AnpePersona entity);

    AnpePersona fromAnpePersonaDTOToEntity(AnpePersonaDTO dto);
}
