package com.isei.scod.Mapper;

import com.isei.scod.DTO.AnpePersonaDTO;
import com.isei.scod.DTO.AnrpRuoloPersonaDTO;
import com.isei.scod.Entity.AnrpRuolopersona;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnrpRuoloPersonaMapper {

    AnrpRuoloPersonaDTO fromAnrpRuoloPersonaEntityToDTO (AnrpRuolopersona entity);

    AnrpRuolopersona fromAnrpRuoloPersonaDTOtoEntity(AnpePersonaDTO dto);



}
