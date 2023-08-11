package com.isei.scod.Repository;

import com.isei.scod.Entity.CodsDistacco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodsDistaccoRepository extends JpaRepository<CodsDistacco, Integer> {
}
