package com.isei.scod.Repository;

import com.isei.scod.Entity.AndfDocumentisocieta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndfDocumentisocietaRepository extends JpaRepository<AndfDocumentisocieta,Integer> {
}
