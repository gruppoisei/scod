package com.isei.scod.Repository;


import com.isei.scod.Entity.AnpePersona;
import com.isei.scod.Entity.AnrpRuolopersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnrpRuoloPersonaRepository extends JpaRepository<AnrpRuolopersona, Integer> {

    @Query("SELECT a FROM AnrpRuolopersona a WHERE a.anrpFkAnpePersonaid.id = :id")
    List<AnrpRuolopersona> findByIdPersona(@Param("id") Integer id);

}
