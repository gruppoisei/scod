package com.isei.scod.Mapper;

import com.isei.scod.DTO.DistaccoDTO;
import com.isei.scod.Entity.CodsDistacco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DistaccoMapper {

    CodsDistacco fromDistaccoDTOToentity(DistaccoDTO dto);
    DistaccoDTO fromCodsDistaccoEntityToDTO(CodsDistacco entity);

}
