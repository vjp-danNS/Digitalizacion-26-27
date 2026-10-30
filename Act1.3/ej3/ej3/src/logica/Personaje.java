/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
public abstract class Personaje {

    private String nombre;
    private int fuerza, defensa, vida, vidaMax;
    private double probabilidadDeGolpe;

    public Personaje(String nombre, int vida, int fuerzaMin, int fuerzaMax, int defensaMin, int defensaMax, double probabilidadDeGolpe) {
        this.nombre = nombre;
        this.fuerza = aleatorio(fuerzaMin, fuerzaMax);
        this.defensa = aleatorio(defensaMin, defensaMax);
        this.vida = vida;
        this.vidaMax = vida;
        this.probabilidadDeGolpe = probabilidadDeGolpe;
    }

    public Personaje() {
        nombre = "";
        fuerza = 0;
        defensa = 0;
        vida = 0;

    }

    //Getter/ Setter
    ;
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return this.fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    //To string
    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", fuerza=" + fuerza + ", defensa=" + defensa + ", vida=" + vida + '}';
    }

    //Metodos
    //Protected para que las subclases lo puedan llamar
    protected static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public boolean vivo() {

        if (vida <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public String ataca(Personaje defender) {
        return ataque(defender, Math.random());
    }

    /*Hace el ataque con una tirada concreta. Es protected porque lo usa Picaro para
    forzar un critico (tirada 0.0 = acierta siempre y es critico)*/
    protected String ataque(Personaje defender, double hit) {

        if (hit <= probabilidadDeGolpe) {
            //Comprueba el critico
            boolean critico = hit <= 0.05;
            
            //Si el daño calculado es menor a 1, devuelve 1
            int daño = Math.max(1, getFuerza() - defender.getDefensa());
            if (critico) {
                daño *= 2;
            }
            int real = defender.recibeDaño(daño);

            //Si el defensor no recibe daño es que ha esquivado el golpe (Capa y Espada)
            if (real == 0) {
                return getNombre() + " ataca a " + defender.getNombre()
                        + " pero " + defender.getNombre() + " lo esquiva";
            }

            //(critico ? "(CRITICO!) " : "") es una comprobacion de si es critico el golpe, si lo es, da el mensaje de (CRITICO!) si no no agrega nada
            return (critico ? "(CRITICO!) " : "")
                    + getNombre() + " ataca a " + defender.getNombre()
                    + " y le quita " + real + " puntos de vida";
        }
        return getNombre() + " ataca a " + defender.getNombre() + " pero falla el golpe";
    }

    public int recibeDaño(int daño) {
        vida -= daño;
        return daño;
    }

    //Se llama al final de cada turno. Por defecto no hace nada; las clases con habilidades la sobrescriben
    public void finDeTurno() {
    }
}
