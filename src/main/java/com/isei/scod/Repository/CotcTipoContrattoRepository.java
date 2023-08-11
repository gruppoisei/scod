package com.isei.scod.Repository;

import com.isei.scod.Entity.CotcTipocontratto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotcTipoContrattoRepository extends JpaRepository<CotcTipocontratto, Integer> {
}
