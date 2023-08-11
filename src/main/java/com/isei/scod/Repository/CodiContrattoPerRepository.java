package com.isei.scod.Repository;

import com.isei.scod.Entity.CodiContrattoper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;

@Repository
public interface CodiContrattoPerRepository extends JpaRepository<CodiContrattoper, Integer> {
}
