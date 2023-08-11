package com.isei.scod.Mapper;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.Entity.AnpePersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDTO fromAnpePersonaEntityToDTO(AnpePersona entity);

    AnpePersona fromAnpePersonaDTOToEntity(PersonaDTO dto);
}
