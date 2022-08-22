package com.portfolioargpr.jcm.Service;

import com.portfolioargpr.jcm.Models.Proyecto;
import com.portfolioargpr.jcm.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectoService {
    private final ProyectoRepository proyectoRepository;
    
    @Autowired
    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }
    
    public Proyecto addProyecto(Proyecto proyecto){
        return proyectoRepository.save(proyecto);
    }
    
    public List<Proyecto> findProyecto(){
        return proyectoRepository.findAll();
    }
    
    public Proyecto updateProyecto(Proyecto proyecto){
        return proyectoRepository.save(proyecto);
    }
    
    public void deleteProyecto(Long id){
        proyectoRepository.deleteById(id);
    }
}

