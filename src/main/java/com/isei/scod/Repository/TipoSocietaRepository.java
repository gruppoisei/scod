package com.isei.scod.Repository;


import com.isei.scod.Entity.AntsTipoSocieta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSocietaRepository extends JpaRepository<AntsTipoSocieta, Integer> {
}
