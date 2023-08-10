package com.isei.scod.Repository;


import com.isei.scod.Entity.AnpePersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnpePersonaRepository extends JpaRepository<AnpePersona, Integer> {

}
