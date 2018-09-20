package com.porfaltadeiq.hemuerto.basededatospersona;

import java.util.ArrayList;


public class Telefono {
    private int numero;
    private String descripcion;

    public Telefono(int num, String des){
        this.numero = num;
        this.descripcion = des;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
