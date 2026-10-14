/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author alumno
 */
public class Personaje {
    private String nombre;
    private int fuerza, defensa, vida;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.fuerza = (int)(Math.random()*(10-3+1)+3);
        this.defensa = (int)(Math.random()*(5+1)); // Min 0
        this.vida = 10;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + '}';
    }
    
    
    
    //Metodos
    
    public boolean vivo(){
    
        if (vida <= 0) {
            return false;
        }else{
            return true;
        }
    }
    
    public String ataca(Personaje defender){
        
        
        
        int defensaDefensor = defender.getDefensa();
        int daño;
        double hit = Math.random()*1;
        
        //Comprueba si el golpe acierta o no
        if (hit>=0.7) {
            
            //Si el daño es menos de 1, lo deja en 1
            if ((fuerza-defensaDefensor)<1) {
                daño=1;
            }else{
                daño= fuerza-defensaDefensor;
            }
            //Cambia la vida del defensor
            defender.setVida(defender.getVida()-daño);
            //Devuelve el daño realizado
            return (nombre+" ataca a "+defender.getNombre()+" y le quita "+ daño+" puntos de vida");
        }
        
        return (nombre+" ataca a "+defender.getNombre()+" pero falla el golpe");
    }
}
