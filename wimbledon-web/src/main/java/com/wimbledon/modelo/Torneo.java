package com.wimbledon.modelo;
// Generated Nov 17, 2016 8:50:16 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Set;

/**
 * Torneo generated by hbm2java
 */
public class Torneo  implements java.io.Serializable {


     private Integer tornId;
     private String nombre;
     private String estado;
     private String premio;
     private Set<Partido> partidos = new HashSet<Partido>(0);

    public Torneo() {
    }

	
    public Torneo(Integer tornId, String nombre, String estado, String premio) {
        this.tornId = tornId;
        this.nombre = nombre;
        this.estado = estado;
        this.premio = premio;
    }
    public Torneo(Integer tornId, String nombre, String estado, String premio, Set<Partido> partidos) {
       this.tornId = tornId;
       this.nombre = nombre;
       this.estado = estado;
       this.premio = premio;
       this.partidos = partidos;
    }
   
    public Integer getTornId() {
        return this.tornId;
    }
    
    public void setTornId(Integer tornId) {
        this.tornId = tornId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getPremio() {
        return this.premio;
    }
    
    public void setPremio(String premio) {
        this.premio = premio;
    }
    public Set<Partido> getPartidos() {
        return this.partidos;
    }
    
    public void setPartidos(Set<Partido> partidos) {
        this.partidos = partidos;
    }




}

