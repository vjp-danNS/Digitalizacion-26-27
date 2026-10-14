/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
/*La clase Picaro permite tiene menos vida, pero tiene la habilidad 
CAPA Y ESPADA: Al usarla evitar el siguiente ataque que le golpearia y asegura que el siguiente ataque sea critico*/

public class Picaro extends Personaje {
     private String nombre;
    private int fuerza, defensa, vida;
    private boolean capaYEspada;
    
    private String descripcion="La clase Picaro tiene menos vida, pero tiene la habilidad CAPA Y ESPADA\n\n" +
"CAPA Y ESPADA: Al usarla evitar el siguiente ataque que le golpearia y asegura que el siguiente ataque sea critico. 3 Turnos de enfriamiento";

    //Constructor
    public Picaro(String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.fuerza = (int) (Math.random() * (10 - 3 + 1) + 3);// 3 a 10 de fuerza
        this.defensa = (int) (Math.random() * (5  + 1)); // Min 0
        this.vida = 8;
        this.capaYEspada = false;
    }
    public Picaro(){
        nombre="";
        fuerza=0;
        defensa=0;
        vida=0;
        capaYEspada=false;
    }
    
    //Getter/Setter
    public String getDescripcion() {
        return descripcion;
    }


    public boolean isCapaYEspada() {
        return capaYEspada;
    }

    public void setCapaYEspada(boolean capaYEspada) {
        this.capaYEspada = capaYEspada;
    }
    
    //toString()

    @Override
    public String toString() {
        return "Picaro{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + ", capaYEspada=" + capaYEspada + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    

    
    
    
}
