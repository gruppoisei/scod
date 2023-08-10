package com.isei.scod.Mapper;

import com.isei.scod.DTO.SysaStatoAbilitazioneDTO;
import com.isei.scod.Entity.SysaStatoAbilitazione;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SysaStatoAbilitazioneMapper {

    SysaStatoAbilitazioneDTO fromSysaStatoAbilitazioneEntitytoDTO(SysaStatoAbilitazione entity);

    SysaStatoAbilitazione fromSysaStatoAbilitazioneEntitytoDTO(SysaStatoAbilitazioneDTO dto);
}
