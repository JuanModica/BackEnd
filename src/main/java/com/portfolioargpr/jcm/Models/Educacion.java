package com.portfolioargpr.jcm.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "educacion")
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String nombreEdu;
    private int fechaEdu;
    private String direccionEdu;
    private String ubicacionEdu;
    private Long contactoEdu;
    private String descEdu;
    private String estadoEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String nombreEdu, int fechaEdu, String direccionEdu, String ubicacionEdu, Long contactoEdu, String descEdu, String estadoEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.fechaEdu = fechaEdu;
        this.direccionEdu = direccionEdu;
        this.ubicacionEdu = ubicacionEdu;
        this.contactoEdu = contactoEdu;
        this.descEdu = descEdu;
        this.estadoEdu = estadoEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public String getDireccionEdu() {
        return direccionEdu;
    }

    public void setDireccionEdu(String direccionEdu) {
        this.direccionEdu = direccionEdu;
    }

    public String getUbicacionEdu() {
        return ubicacionEdu;
    }

    public void setUbicacionEdu(String ubicacionEdu) {
        this.ubicacionEdu = ubicacionEdu;
    }

    public Long getContactoEdu() {
        return contactoEdu;
    }

    public void setContactoEdu(Long contactoEdu) {
        this.contactoEdu = contactoEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getEstadoEdu() {
        return estadoEdu;
    }

    public void setEstadoEdu(String estadoEdu) {
        this.estadoEdu = estadoEdu;
    }
      
}