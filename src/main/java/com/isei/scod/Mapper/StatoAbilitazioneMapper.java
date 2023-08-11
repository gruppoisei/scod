package com.isei.scod.Mapper;

import com.isei.scod.DTO.StatoAbilitazioneDTO;
import com.isei.scod.Entity.SysaStatoAbilitazione;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StatoAbilitazioneMapper {

    StatoAbilitazioneDTO fromSysaStatoAbilitazioneEntitytoDTO(SysaStatoAbilitazione entity);

    SysaStatoAbilitazione fromSysaStatoAbilitazioneEntitytoDTO(StatoAbilitazioneDTO dto);
}
