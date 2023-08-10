package com.isei.scod.Repository;


import com.isei.scod.Entity.AnrpRuolopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnrpRuoloPersonaRepository extends JpaRepository<AnrpRuolopersona, Integer> {

}
