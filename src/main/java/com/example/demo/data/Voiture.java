package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Voiture {

    private String marque;
    private double prix;
    private int id;

    public void Voiture(String marque,double prix,int id){
        this.marque = marque;
        this.prix = prix;
        this.id = id;
    }


    public void setMarque(String m){
        this.marque = m;
    }

    public void setPrix(double p){
        this.prix = p;
    }

    public void setId(int i){
        this.id = i;
    }

    public String getMarque(){
        return this.marque;
    }

    public double getPrix(){
        return this.prix;
    }

    public int getId(){
        return this.id;
    }
}

