/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

/**
 *
 * @author alumno
 */
public class Libro {
    private int numPag;
    private String nombre;
    private boolean almacenado;

    public Libro(int numPag, String nombre, boolean almacenado) {
        this.numPag = numPag;
        this.nombre = nombre;
        this.almacenado = almacenado;
    }
    
    public Libro(){
        numPag= 0;
        nombre="";
        almacenado=false;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlmacenado() {
        return almacenado;
    }

    public void setAlmacenado(boolean almacenado) {
        this.almacenado = almacenado;
    }

    @Override
    public String toString() {
        return nombre+" \nCantidad de paginas: "+numPag+" \nEsta almacenado?: "+almacenado;
    }
    
    
}


