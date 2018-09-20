package com.porfaltadeiq.hemuerto.basededatospersona;

import java.util.ArrayList;

public class Principal {
    public static void main(String a[]) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona Manu = new Persona("Manuel", "Mouzo", 24453945, "17/04/1999");

        personas.add(Manu);

        Manu.añadirTelefono(new Telefono(674474309, "Mi télefono"));
        Manu.añadirTelefono(new Telefono(76767609, "Mi otro télefono"));


        Persona p = buscar(personas, "Manuel");
        p.mostrarTelefonos();
    }

    public static Persona buscar(ArrayList<Persona> personas, String nombre) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals(nombre)) {
                return (personas.get(i));
            }
        }
        return null;
    }
}
