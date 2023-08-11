package com.isei.scod.Repository;


import com.isei.scod.Entity.AnsoSocieta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnsoSocietaRepository extends JpaRepository<AnsoSocieta, Integer> {
}
