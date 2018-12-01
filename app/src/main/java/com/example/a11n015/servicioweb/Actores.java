package com.example.a11n015.servicioweb;

public class Actores {

    private String actor;
    private  String personaje;
    private  String sexo;
    private  String firstapparance;

    public Actores(String actor, String personaje, String sexo, String firstapparance) {
        this.actor = actor;
        this.personaje = personaje;
        this.sexo = sexo;
        this.firstapparance = firstapparance;
    }

    public String getActor() {
        return actor;
    }

    public String getPersonaje() {
        return personaje;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFirstapparance() {
        return firstapparance;
    }
}
