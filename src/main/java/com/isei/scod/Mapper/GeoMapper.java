package com.isei.scod.Mapper;

import com.isei.scod.DTO.*;
import com.isei.scod.Entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GeoMapper {

    PaeseDTO fromPaeseEntityToDTO(GepaPaese entity);

    GepaPaese fromPaeseDTOToEntity(PaeseDTO dto);

    ComuneDTO fromComuneEntitytoDTO(GecoComune entity);

    GecoComune fromComuneDTOToEntity(ComuneDTO dto);

    ToponimoDTO fromToponimoEntitytoDTO(GetoToponimo entity);

    GetoToponimo fromToponimoDTOToEntity(ToponimoDTO dto);

    ProvinciaDTO fromProvinciaEntityToDTO(GeprProvincia entity);

    GeprProvincia fromProvinciaDTOToEntity(ProvinciaDTO dto);

    RegioneDTO fromRegioneEntityToDTO(GereRegione entity);

    GereRegione fromRegioneDTOToEntity(RegioneDTO dto);

    AreaGeograficaDTO fromAreaGeograficaEntityToDTO(GeagAreaGeografica entity);

    GeagAreaGeografica fromAreaGeograficaDTOToEntity(AreaGeograficaDTO dto);
}
