package com.isei.scod.Repository;

import com.isei.scod.Entity.AndpDocumentipersona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndpDocumentiPersonaRepository extends JpaRepository<AndpDocumentipersona, Integer> {
}
