package com.isei.scod.Mapper;

import com.isei.scod.DTO.CcnlDTO;
import com.isei.scod.DTO.ContrattoPersDTO;
import com.isei.scod.DTO.LivelloDTO;
import com.isei.scod.DTO.TipoContrattoDTO;
import com.isei.scod.Entity.CoccCcnl;
import com.isei.scod.Entity.CodiContrattoper;
import com.isei.scod.Entity.ColiLivello;
import com.isei.scod.Entity.CotcTipocontratto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContrattiMapper {

    CoccCcnl fromCoccCnlDTOToEntity(CcnlDTO dto);

    CcnlDTO fromCoccCnlEntityToDTO(CoccCcnl entity);

    LivelloDTO fromColiLivelloEntityToDTO(ColiLivello entity);

    ColiLivello fromColiLivelloDTOToEntity(LivelloDTO dto);

    ContrattoPersDTO fromCodiContrattoperEntityToDTO(CodiContrattoper entity);

    CodiContrattoper fromContrattoPersDTOToEntity(ContrattoPersDTO dto);

    TipoContrattoDTO fromCotcTipocontrattoEntityToDTO(CotcTipocontratto entity);

    CotcTipocontratto fromTipoContrattoDTOToEntity(TipoContrattoDTO dto);

}
