package com.isei.scod.Mapper;

import com.isei.scod.DTO.RegisterDTO;
import com.isei.scod.Entity.SyutUtente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UtenteMapper {

    SyutUtente fromRegisterDTOToUtente(RegisterDTO dto);
}
