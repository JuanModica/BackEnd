package com.portfolioargpr.jcm.Models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name = "idPersona")
    private Long idPersona;
    @Column(name = "nombrePersona", nullable = false)
    private String nombrePersona;
    @Column(name = "apellidoPersona", nullable = false)
    private String apellidoPersona;
    @Column(name = "tituloPersona", nullable = false)
    private String tituloPersona;
    @Column(name = "edadPersona", nullable = false)
    private String edadPersona;
    @Column(name = "dniPersona", nullable = false)
    private Long dniPersona;
    @Column(name = "direccionPersona", nullable = false)
    private String direccionPersona;
    @Column(name = "ubicacionPersona", nullable = false)
    private String ubicacionPersona;
    @Column(name = "contactoPersona", nullable = false)
    private Long contactoPersona;
    @Column(name = "emailPersona", nullable = false)
    private String emailPersona;
    @Column(name = "perfilImgPersona", nullable = false)
    private String perfilImgPersona;
    @Column(name = "bannerImgPersona", nullable = false)
    private String bannerImgPersona;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Educacion> educacionList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experiencia> experienciaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkills")
    private List<Skills> skillsList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idPro")
    private List<Proyecto> proyectoList;

    public Persona() {
    }

    public Persona(Long idPersona, String nombrePersona, String apellidoPersona, String tituloPersona,
            String edadPersona, Long dniPersona, String direccionPersona, String ubicacionPersona, Long contactoPersona,
            String emailPersona, String perfilImgPersona, String bannerImgPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.tituloPersona = tituloPersona;
        this.edadPersona = edadPersona;
        this.dniPersona = dniPersona;
        this.direccionPersona = direccionPersona;
        this.ubicacionPersona = ubicacionPersona;
        this.contactoPersona = contactoPersona;
        this.emailPersona = emailPersona;
        this.perfilImgPersona = perfilImgPersona;
        this.bannerImgPersona = bannerImgPersona;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getTituloPersona() {
        return tituloPersona;
    }

    public void setTituloPersona(String tituloPersona) {
        this.tituloPersona = tituloPersona;
    }

    public String getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(String edadPersona) {
        this.edadPersona = edadPersona;
    }

    public Long getDniPersona() {
        return dniPersona;
    }

    public void setDniPersona(Long dniPersona) {
        this.dniPersona = dniPersona;
    }

    public String getDireccionPersona() {
        return direccionPersona;
    }

    public void setDireccionPersona(String direccionPersona) {
        this.direccionPersona = direccionPersona;
    }

    public String getUbicacionPersona() {
        return ubicacionPersona;
    }

    public void setUbicacionPersona(String ubicacionPersona) {
        this.ubicacionPersona = ubicacionPersona;
    }

    public Long getContactoPersona() {
        return contactoPersona;
    }

    public void setContactoPersona(Long contactoPersona) {
        this.contactoPersona = contactoPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public String getPerfilImgPersona() {
        return perfilImgPersona;
    }

    public void setPerfilImgPersona(String perfilImgPersona) {
        this.perfilImgPersona = perfilImgPersona;
    }

    public String getBannerImgPersona() {
        return bannerImgPersona;
    }

    public void setBannerImgPersona(String bannerImgPersona) {
        this.bannerImgPersona = bannerImgPersona;
    }

}
