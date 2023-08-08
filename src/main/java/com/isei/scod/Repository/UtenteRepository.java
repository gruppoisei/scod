package com.isei.scod.Repository;

import com.isei.scod.Entity.SyutUtente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<SyutUtente, Integer> {

    Optional<SyutUtente> findByAnutUserName(String username);

}
