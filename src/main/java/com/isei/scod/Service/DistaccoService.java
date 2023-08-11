package com.isei.scod.Service;

import com.isei.scod.DTO.DistaccoDTO;
import com.isei.scod.Entity.CodsDistacco;
import com.isei.scod.Entity.ColiLivello;
import com.isei.scod.Entity.CotcTipocontratto;
import com.isei.scod.Exception.NotFoundException;
import com.isei.scod.Mapper.DistaccoMapper;
import com.isei.scod.Repository.CodsDistaccoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DistaccoService {

    @Autowired
    CodsDistaccoRepository distaccoRepository;

    @Autowired
    DistaccoMapper distaccoMapper;

    public DistaccoDTO getDistaccoById(Integer id) throws NotFoundException {

        Optional<CodsDistacco> distacco = distaccoRepository.findById(id);

        if (!distacco.isPresent())
            throw new NotFoundException(ColiLivello.class, id);

        return distaccoMapper.fromCodsDistaccoEntityToDTO(distacco.get());
    }


}
