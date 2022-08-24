package com.portfolioargpr.jcm.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "experiencia")
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreExp;
    private int fechaExp;
    private String direccionExp;
    private String ubicacionExp;
    private Long contactoExp;
    private String descExp;
    private String puestoExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nombreExp, int fechaExp, String direccionExp, String ubicacionExp, Long contactoExp, String descExp, String puestoExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.fechaExp = fechaExp;
        this.direccionExp = direccionExp;
        this.ubicacionExp = ubicacionExp;
        this.contactoExp = contactoExp;
        this.descExp = descExp;
        this.puestoExp = puestoExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getDireccionExp() {
        return direccionExp;
    }

    public void setDireccionExp(String direccionExp) {
        this.direccionExp = direccionExp;
    }

    public String getUbicacionExp() {
        return ubicacionExp;
    }

    public void setUbicacionExp(String ubicacionExp) {
        this.ubicacionExp = ubicacionExp;
    }

    public Long getContactoExp() {
        return contactoExp;
    }

    public void setContactoExp(Long contactoExp) {
        this.contactoExp = contactoExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getPuestoExp() {
        return puestoExp;
    }

    public void setPuestoExp(String puestoExp) {
        this.puestoExp = puestoExp;
    }
    
}
