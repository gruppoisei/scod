package com.isei.scod.Service;

import com.isei.scod.DTO.CcnlDTO;
import com.isei.scod.DTO.ContrattoPersDTO;
import com.isei.scod.DTO.LivelloDTO;
import com.isei.scod.DTO.TipoContrattoDTO;
import com.isei.scod.Entity.CoccCcnl;
import com.isei.scod.Entity.CodiContrattoper;
import com.isei.scod.Entity.ColiLivello;
import com.isei.scod.Entity.CotcTipocontratto;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.ContrattiMapper;
import com.isei.scod.Repository.CoccCcnlRepository;
import com.isei.scod.Repository.CodiContrattoPerRepository;
import com.isei.scod.Repository.ColiLivelloRepository;
import com.isei.scod.Repository.CotcTipoContrattoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContrattiService {

    @Autowired
    CoccCcnlRepository ccnlRepository;

    @Autowired
    ColiLivelloRepository livelloRepository;

    @Autowired
    CodiContrattoPerRepository contrattoPerRepository;

    @Autowired
    CotcTipoContrattoRepository tipoContrattoRepository;

    @Autowired
    ContrattiMapper contrattiMapper;

    public CcnlDTO getCcnlById(Integer id) throws NotFoundException {

        Optional<CoccCcnl> ccnl = ccnlRepository.findById(id);

        if (!ccnl.isPresent())
            throw new NotFoundException(CcnlDTO.class, id);

        return contrattiMapper.fromCoccCnlEntityToDTO(ccnl.get());
    }

    public CcnlDTO getCcnlByDesc(String desc) throws NotFoundException {

        Optional<CoccCcnl> ccnl = ccnlRepository.findByCoccDesc(desc);

        if (!ccnl.isPresent())
            throw new NotFoundException(CcnlDTO.class, desc);

        return contrattiMapper.fromCoccCnlEntityToDTO(ccnl.get());

    }

    public LivelloDTO getLivellolById(Integer id) throws NotFoundException {

        Optional<ColiLivello> livello = livelloRepository.findById(id);

        if (!livello.isPresent())
            throw new NotFoundException(ColiLivello.class, id);

        return contrattiMapper.fromColiLivelloEntityToDTO(livello.get());
    }

    public LivelloDTO getLivelloByCcnl(Integer idCcnl) throws NotFoundException {

        Optional<ColiLivello> livello = livelloRepository.findByColiFkCoccccnlid(contrattiMapper.fromCoccCnlDTOToEntity(getCcnlById(idCcnl)));

        if (!livello.isPresent())
            throw new NotFoundException(ColiLivello.class, CcnlDTO.class, idCcnl);

        return contrattiMapper.fromColiLivelloEntityToDTO(livello.get());

    }

    public ContrattoPersDTO getContrattoPersById(Integer id) throws NotFoundException {

        Optional<CodiContrattoper> contratto = contrattoPerRepository.findById(id);

        if (!contratto.isPresent())
            throw new NotFoundException(ColiLivello.class, id);

        return contrattiMapper.fromCodiContrattoperEntityToDTO(contratto.get());
    }

    public Boolean saveContrattoPers(@Valid ContrattoPersDTO dto) {

        CodiContrattoper entity = contrattiMapper.fromContrattoPersDTOToEntity(dto);
        entity = contrattoPerRepository.save(entity);

        return true;

    }

    public TipoContrattoDTO getTipoContrattoById(Integer id) throws NotFoundException {

        Optional<CotcTipocontratto> tipoContratto = tipoContrattoRepository.findById(id);

        if (!tipoContratto.isPresent())
            throw new NotFoundException(ColiLivello.class, id);

        return contrattiMapper.fromCotcTipocontrattoEntityToDTO(tipoContratto.get());
    }

}
