package com.isei.scod.Repository;


import com.isei.scod.Entity.GetoToponimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToponimoRepository extends JpaRepository<GetoToponimo, Integer> {
}
