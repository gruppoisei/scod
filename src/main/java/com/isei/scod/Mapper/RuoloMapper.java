package com.isei.scod.Mapper;

import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.Entity.AnruRuolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuoloMapper {
    RuoloDTO fromAnruRuoloEntitytoDTO(AnruRuolo entity);

    AnruRuolo fromAnruRuoloDTOToEntity (RuoloDTO dto);
}
