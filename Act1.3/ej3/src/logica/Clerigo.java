/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */

/*La clase Clerigo es la que tiene mas vida, adicionalmente tiene la habilidad NOVA CURATIVA. NOVA CURATIVA: Cura a todos los aliados 5 puntos de vida, como maximo su vida inicial. Una vez por combate*/
public class Clerigo extends Personaje {
    private String nombre;
    private int fuerza, defensa, vida;
    private boolean nova=true;
    
    private String descripcion = "La clase Clerigo es la que tiene mas vida, adicionalmente tiene la habilidad NOVA CURATIVA. "
            + "\n\nNOVA CURATIVA: Cura a todos los aliados 5 puntos de vida, como maximo su vida inicial. \n\nUna vez por combate";
    
    //Constructor
    public Clerigo(String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.fuerza = (int) (Math.random() * (10 - 3 + 1) + 3);//
        this.defensa = (int) (Math.random() * (5  + 1)); // Min 0
        this.vida = 15;
    }
    public Clerigo(){
        nombre="";
        fuerza=0;
        defensa=0;
        vida=0;
        nova=true;
    }
    
    //Getter/Setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //toString
    @Override
    public String toString() {
        return "Clerigo{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
    
    
}
