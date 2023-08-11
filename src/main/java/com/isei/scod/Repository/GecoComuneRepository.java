package com.isei.scod.Repository;


import com.isei.scod.Entity.GecoComune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GecoComuneRepository extends JpaRepository<GecoComune, Integer> {
}
