package com.isei.scod.Repository;


import com.isei.scod.Entity.GepaPaese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GepaPaeseRepository extends JpaRepository<GepaPaese, Integer> {
}
