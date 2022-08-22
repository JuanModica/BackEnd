package com.portfolioargpr.jcm.Repository;

import com.portfolioargpr.jcm.Models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
    
}