package com.isei.scod.Repository;


import com.isei.scod.Entity.SysaStatoAbilitazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysaStatoAbilitazioneRepository extends JpaRepository<SysaStatoAbilitazione, Integer> {
}
