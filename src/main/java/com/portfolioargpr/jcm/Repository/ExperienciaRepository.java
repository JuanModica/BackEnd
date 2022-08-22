package com.portfolioargpr.jcm.Repository;

import com.portfolioargpr.jcm.Models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
