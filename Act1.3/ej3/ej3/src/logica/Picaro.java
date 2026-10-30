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
    private boolean capaYEspada;   // true = esquivara el siguiente golpe que le alcance
    private boolean criticoListo;  // true = su siguiente ataque sera critico
    private int enfriamiento = 0;  // turnos que faltan para poder volver a usarla
    
    private String descripcion="La clase Picaro tiene menos vida, pero tiene la habilidad CAPA Y ESPADA\n\n" +
"CAPA Y ESPADA: Al usarla evitar el siguiente ataque que le golpearia y asegura que el siguiente ataque sea critico. 3 Turnos de enfriamiento";

    //Constructor
    public Picaro(String nombre) {
        super(nombre,8, 3, 10, 0, 5,0.7);
        this.capaYEspada = false;
    }
    public Picaro(){
        super();
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

    //No se puede usar durante el enfriamiento ni mientras la capa siga esperando un golpe
    public boolean puedeUsarCapaYEspada() {
        return !capaYEspada && enfriamiento == 0;
    }

    //CAPA Y ESPADA: esquiva el siguiente golpe que le alcance y su siguiente ataque es critico
    public void usarCapaYEspada() {
        if (puedeUsarCapaYEspada()) {
            capaYEspada = true;
            criticoListo = true;
            //3 turnos de enfriamiento despues del turno de uso (el de uso tambien cierra con finDeTurno)
            enfriamiento = 4;
        }
    }

    //Si tiene el critico preparado, el ataque acierta siempre y es critico
    @Override
    public String ataca(Personaje defender) {
        if (criticoListo) {
            criticoListo = false;
            return ataque(defender, 0.0);
        }
        return super.ataca(defender);
    }

    //Si la capa esta activa evita el golpe (0 de daño) y se gasta
    @Override
    public int recibeDaño(int daño) {
        if (capaYEspada) {
            capaYEspada = false;
            return 0;
        }
        return super.recibeDaño(daño);
    }

    @Override
    public void finDeTurno() {
        if (enfriamiento > 0) {
            enfriamiento--;
        }
    }
    
    //toString()

    @Override
    public String toString() {
        return "Picaro{" + "nombre=" + getNombre() + ", fuerza=" + getFuerza() + ", defensa=" + getDefensa() + ", vida=" + getVida() + ", capaYEspada=" + capaYEspada + ", descripcion=" + descripcion + '}';
    }
    
    
    
    
    

    
    
    
}
