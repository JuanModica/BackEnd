package com.portfolioargpr.jcm.Service;

import com.portfolioargpr.jcm.Models.Experiencia;
import com.portfolioargpr.jcm.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;
    
    @Autowired
    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public List<Experiencia> findExperiencia(){
        return experienciaRepository.findAll();
    }
    
    public Experiencia updateExperiencia(Experiencia experiencia){
        return experienciaRepository.save(experiencia);
    }
    
    public void deleteExperiencia(Long id){
        experienciaRepository.deleteById(id);
    }
}

