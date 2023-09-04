package com.isei.scod.Repository;

import com.isei.scod.Entity.SyutUtente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SyutUtenteRepository extends JpaRepository<SyutUtente, Integer> {

    Optional<SyutUtente> findBySyutUserName(String username);

    @Modifying
    @Query("UPDATE SyutUtente s set s.syutFlagAttiva = 0 where s.id = :id")
    void setFlagAttivaFalse(@Param("id") Integer id);

}
