package com.isei.scod.Mapper;

import com.isei.scod.DTO.AnruRuoloDTO;
import com.isei.scod.Entity.AnruRuolo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnruRuoloMapper {
    AnruRuoloDTO fromAnruRuoloEntitytoDTO(AnruRuolo entity);

    AnruRuolo fromAnruRuoloDTOToEntity (AnruRuoloDTO dto);
}
