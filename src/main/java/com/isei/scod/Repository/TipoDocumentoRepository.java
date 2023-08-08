package com.isei.scod.Repository;

import com.isei.scod.Entity.AltaTipodocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository<AltaTipodocumento, Integer> {

}
