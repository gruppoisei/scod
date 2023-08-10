package com.isei.scod.Repository;


import com.isei.scod.Entity.AnruRuolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnruRuoloRepository extends JpaRepository<AnruRuolo, Integer> {

}
