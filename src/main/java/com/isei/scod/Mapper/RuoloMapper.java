package com.isei.scod.Mapper;

import com.isei.scod.DTO.RuoloDTO;
import com.isei.scod.Entity.AnruRuolo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RuoloMapper {
    RuoloDTO fromAnruRuoloEntitytoDTO(AnruRuolo entity);

    List<RuoloDTO> fromListAnruRuoloEntitytoDTO(List<AnruRuolo> entity);

    AnruRuolo fromAnruRuoloDTOToEntity (RuoloDTO dto);
}
