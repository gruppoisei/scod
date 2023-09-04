package com.isei.scod.Repository;


import com.isei.scod.Entity.AnpePersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AnpePersonaRepository extends JpaRepository<AnpePersona, Integer> {

    @Modifying
    @Query("UPDATE  AnpePersona a set a.anpeFlagAttiva = 0 where a.id = :id")
    void setFlagAttivaFalse(@Param("id") Integer id);

}
