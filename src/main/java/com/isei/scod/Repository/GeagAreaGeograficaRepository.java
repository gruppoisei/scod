package com.isei.scod.Repository;


import com.isei.scod.Entity.GeagAreaGeografica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeagAreaGeograficaRepository extends JpaRepository<GeagAreaGeografica, Integer> {
}
