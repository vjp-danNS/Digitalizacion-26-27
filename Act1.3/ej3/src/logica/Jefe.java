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
    private String nombre;
    private int fuerza, defensa, vida;
    
    public Jefe(String nombre){
        super(nombre);
        this.nombre=nombre;
        this.fuerza =(int) (Math.random() * (10 - 3 + 1) + 3);//Min 5 Max 10
        this.defensa = (int) (Math.random() * (6 - 3 + 1) + 3); // Min 3 max  6
        this.vida = 20; //
    }
    
    public Jefe(){
        super();
    }

    @Override
    public String toString() {
        return "Jefe{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + '}';
    }
    
    
    
    @Override
    public String ataca(Personaje defender) {

        int defensaDefensor = defender.getDefensa();
        int daño;
        double hit = Math.random() ;
        
        //Comprueba si el golpe acierta o no
        if (hit >= 0.85) {
            //LOGICA CRITICO, los criticos conforman un ataque que hace el doble de daño
            if (hit >= 0.95) {
                //Si el daño es menos de 1, lo deja en 2
                if ((fuerza - defensaDefensor) < 1) {
                    daño = 2;
                } else {
                    daño = (fuerza - defensaDefensor)*2;
                }
                //Cambia la vida del defensor
                 defender.setVida(defender.getVida() - daño);
                 //Devuelve el daño realizado y aavisa que es un critico
                return ("(CRITICO!) "+nombre + " ataca a " + defender.getNombre() + " y le quita " + daño + " puntos de vida");
            }

            //Si el daño es menos de 1, lo deja en 1
            if ((fuerza - defensaDefensor) < 1) {
                daño = 1;
            } else {
                daño = fuerza - defensaDefensor;
            }
            //Cambia la vida del defensor
            defender.setVida(defender.getVida() - daño);
            //Devuelve el daño realizado
            return (nombre + " ataca a " + defender.getNombre() + " y le quita " + daño + " puntos de vida");
        }

        return (nombre + " ataca a " + defender.getNombre() + " pero falla el golpe");
    }
    
    
}
