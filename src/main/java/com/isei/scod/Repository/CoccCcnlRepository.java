package com.isei.scod.Repository;

import com.isei.scod.Entity.CoccCcnl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CoccCcnlRepository extends JpaRepository<CoccCcnl, Integer> {

    Optional<CoccCcnl> findByCoccDesc(String desc);
}
