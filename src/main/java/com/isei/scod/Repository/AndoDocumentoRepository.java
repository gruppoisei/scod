package com.isei.scod.Repository;

import com.isei.scod.Entity.AndoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AndoDocumentoRepository extends JpaRepository<AndoDocumento, Integer> {

   Optional<AndoDocumento> findByAndoSysuser (String andoSysuser);

}
