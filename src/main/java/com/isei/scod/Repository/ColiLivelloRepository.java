package com.isei.scod.Repository;

import com.isei.scod.Entity.CoccCcnl;
import com.isei.scod.Entity.ColiLivello;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ColiLivelloRepository extends JpaRepository<ColiLivello, Integer> {

    Optional<ColiLivello> findByColiFkCoccccnlid(CoccCcnl coccCcnl);
}
