package com.portfolioargpr.jcm.Service;

import com.portfolioargpr.jcm.Exception.PersonaNotFoundException;
import com.portfolioargpr.jcm.Models.Persona;
import com.portfolioargpr.jcm.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepository personaRepository;
    
    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    
    public Persona addPersona(Persona persona){
        return personaRepository.save(persona);
    }
     
    
    public Persona editPersona(Persona persona){
        return personaRepository.save(persona);
    }
    
    public Persona findPersonaById(Long id){
        return (Persona) personaRepository.findById(id).orElseThrow(() ->new PersonaNotFoundException("Persona no encontrada"));
    }
}

