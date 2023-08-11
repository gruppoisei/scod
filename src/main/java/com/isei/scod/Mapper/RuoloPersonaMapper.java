package com.isei.scod.Mapper;

import com.isei.scod.DTO.PersonaDTO;
import com.isei.scod.DTO.RuoloPersonaDTO;
import com.isei.scod.Entity.AnrpRuolopersona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RuoloPersonaMapper {

    //@Mapping(target = ".", source = "anrpFkAnpePersonaid")
    RuoloPersonaDTO fromAnrpRuoloPersonaEntityToDTO (AnrpRuolopersona entity);

    AnrpRuolopersona fromAnrpRuoloPersonaDTOtoEntity(PersonaDTO dto);



}
