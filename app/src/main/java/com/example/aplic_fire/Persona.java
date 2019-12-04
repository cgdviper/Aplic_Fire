package com.example.aplic_fire;

public class Persona {
    private String RUN, Nombre;

    public Persona(String RUN, String nombre) {
        this.RUN = RUN;
        Nombre = nombre;
    }

    public String getRUN() {
        return RUN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
/*
    public Persona(String RUN, String nombre) {
        this.RUN = RUN;
        Nombre = nombre;
    }


    public String getRUN() {
        return RUN;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }*/
}
