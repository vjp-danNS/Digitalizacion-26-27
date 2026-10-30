/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
/*El Jefe es una clase no jugable. Tiene mas vida, mas fuerza y mas defensa. Tiene menos probabilidad de golpear*/

public class Jefe extends Personaje {
    
    public Jefe(String nombre){
        super(nombre,25, 4, 12, 4, 7,0.55);
    }
    
    public Jefe(){
        super();
    }

    @Override
    public String toString() {
        return "Jefe{" + "nombre=" + getNombre() + ", fuerza=" + getFuerza() + ", defensa=" + getDefensa() + ", vida=" + getVida() + '}';
    }
   
}
