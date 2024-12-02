package com.projeto_final_backEnd.com.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto_final_backEnd.com.entities.Anamnese;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese , Long> {
}
