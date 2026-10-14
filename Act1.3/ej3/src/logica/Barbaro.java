/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
public class Barbaro extends Personaje{
    private String nombre;
    private int fuerza, defensa, vida;
    private boolean furia;
    
    private String descripcion = "La clase Barbaro tiene mas vida de base y mas defensa en promedio la habilidad especial es FURIA"
            + "\n\nFURIA: El Barbaro entra en furia por 2 turnos para reducir el daño a la mitad tiene 3 turnos de enfriamiento";
    
    /*La clase barbaro tendra mas vida y mas defensa en promedio, 
    la habilidad especial es FURIA: entrar en furia por 1 turno para reducir el daño a la mitad*/
    
   //CONSTRUCTORES
    public Barbaro(String nombre) {
        super(nombre);
        this.nombre = nombre;
        this.fuerza = (int) (Math.random() * (10 - 3 + 1) + 3);//
        this.defensa= (int)(Math.random()*(5+1)+3);
        this.vida = 12;
        this.furia=false;
    }
    
    public Barbaro(){
        nombre="";
        fuerza=0;
        defensa=0;
        vida=0;
        furia=false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isFuria() {
        return furia;
    }

    public void setFuria(boolean furia) {
        this.furia = furia;
    }
    
    
    
    public void activarFuria(){
        furia= true;
    }

    @Override
    public String toString() {
        return "Barbaro{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + ", furia=" + furia + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    
    
    
    
    
}
