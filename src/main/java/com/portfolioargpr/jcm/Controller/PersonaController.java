package com.portfolioargpr.jcm.Controller;

import com.portfolioargpr.jcm.Models.Persona;
import com.portfolioargpr.jcm.Service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/persona")
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Persona> getPersona(@PathVariable("id") Long id){
        Persona persona = personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Persona> editPersona(@RequestBody Persona persona){
        Persona updatePersona = personaService.editPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
    
}