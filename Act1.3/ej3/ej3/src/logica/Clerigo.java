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
   
    private boolean nova=true;   // true = todavia puede usar la nova en este combate
    private static final int CURACION = 5;
    
    private String descripcion = "La clase Clerigo es la que tiene mas vida, adicionalmente tiene la habilidad NOVA CURATIVA. "
            + "\n\nNOVA CURATIVA: Cura a todos los aliados 5 puntos de vida, como maximo su vida inicial. \n\nUna vez por combate";
    
    //Constructor
    public Clerigo(String nombre) {
        super(nombre,15,3,10,0,5,0.7); 
        nova=true;
    }
    public Clerigo(){
        super();
        nova=true;
    }
    
    //Getter/Setter
    public String getDescripcion() {
        return descripcion;
    }

    public boolean puedeUsarNova() {
        return nova;
    }

    /*NOVA CURATIVA: cura 5 puntos de vida como maximo hasta su vida inicial. Una vez por combate.
    Ahora mismo el unico aliado es el propio clerigo; devuelve los puntos curados*/
    public int novaCurativa() {
        if (!nova) {
            return 0;
        }
        nova = false;
        int curado = Math.min(CURACION, getVidaMax() - getVida());
        setVida(getVida() + curado);
        return curado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //toString
    @Override
    public String toString() {
        return "Clerigo{" + "nombre=" + getNombre() + ", fuerza=" + getFuerza() + ", defensa=" + getDefensa() + ", vida=" + getVida() + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
    
    
}
