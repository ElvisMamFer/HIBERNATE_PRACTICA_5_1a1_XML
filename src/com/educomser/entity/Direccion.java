package com.educomser.entity;

import java.io.Serializable;

public class Direccion implements Serializable{

    private int id;
    private String calle;
    private String zona;
    private  int numero;
    
     // Constructor getters and setters
    
    public Direccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

        
    @Override
    public String toString() {
        return "Direcion{" + "id=" + id + ", calle=" + calle + ", zona=" + zona + ", numero=" + numero + '}';
    }
    
    
    
}
