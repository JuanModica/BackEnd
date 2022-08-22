package com.portfolioargpr.jcm.Models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "skills")
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkills;
    private String nombreSkills;
    private String imgSkills;
    private int percentSkills;

    public Skills() {
    }

    public Skills(Long idSkills, String nombreSkills, String imgSkills, int percentSkills) {
        this.idSkills = idSkills;
        this.nombreSkills = nombreSkills;
        this.imgSkills = imgSkills;
        this.percentSkills = percentSkills;
    }

    public Long getIdSkills() {
        return idSkills;
    }

    public void setIdSkills(Long idSkills) {
        this.idSkills = idSkills;
    }

    public String getNombreSkills() {
        return nombreSkills;
    }

    public void setNombreSkills(String nombreSkills) {
        this.nombreSkills = nombreSkills;
    }

    public String getImgSkills() {
        return imgSkills;
    }

    public void setImgSkills(String imgSkills) {
        this.imgSkills = imgSkills;
    }

    public int getPercentSkills() {
        return percentSkills;
    }

    public void setPercentSkills(int percentSkills) {
        this.percentSkills = percentSkills;
    }
 
}

