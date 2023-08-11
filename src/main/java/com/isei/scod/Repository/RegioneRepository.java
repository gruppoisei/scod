package com.isei.scod.Repository;

import com.isei.scod.Entity.GereRegione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegioneRepository extends JpaRepository<GereRegione, Integer> {
}
