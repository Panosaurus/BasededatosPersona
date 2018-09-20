package com.porfaltadeiq.hemuerto.basededatospersona;

import java.util.ArrayList;


public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNacimiento;
    private ArrayList<Telefono> telefonos;

    public Persona(String nom, String ape, int dni, String naci){
        this.nombre = nom;
        this.apellido = ape;
        this.dni = dni;
        this.fechaNacimiento = naci;
        this.telefonos = new ArrayList<Telefono>();
    }

    public void añadirTelefono(Telefono f){
        this.telefonos.add(f);
    }

    public void mostrarTelefonos(){ //recibe nada, saca nada
        for(int i=0; i < telefonos.size(); i++ ){
            System.out.println(telefonos.get(i).getDescripcion());
            System.out.println(telefonos.get(i).getNumero());
        }
    }

    public void cambiarTelefono(int num, String des){
        for(int i=0; i < telefonos.size(); i++){
            if(des.equals(telefonos.get(i).getDescripcion())){// esto en c equivale a telefonos[i].getDescripcion()
                telefonos.get(i).setNumero(num);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
