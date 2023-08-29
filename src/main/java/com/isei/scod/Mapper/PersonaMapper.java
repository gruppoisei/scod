package com.isei.scod.Mapper;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.PersonaLoginDTO;
import com.isei.scod.Entity.AnpePersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaDTO fromAnpePersonaEntityToPersonaDTO(AnpePersona entity);

    PersonaLoginDTO fromAnpePersonaEntityToPersonaLoginDTO(AnpePersona entity);

    AnpePersona fromAnpePersonaDTOToEntity(PersonaDTO dto);
}
