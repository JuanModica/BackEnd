package com.portfolioargpr.jcm.Controller;

import com.portfolioargpr.jcm.Models.Educacion;
import com.portfolioargpr.jcm.Service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://frontendjcm.web.app")
@RequestMapping("/educacion")
public class EducacionController {

    @Autowired
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getEducacion() {
        List<Educacion> educaciones = educacionService.findEducacion();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion newEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable("id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
