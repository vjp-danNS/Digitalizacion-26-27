/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
public class Barbaro extends Personaje {

    private boolean furia;
    private int turnosFuria = 0;   // turnos que le quedan de furia
    private int enfriamiento = 0;  // turnos que faltan para poder volver a usarla

    private String descripcion = "La clase Barbaro tiene mas vida de base y mas defensa en promedio la habilidad especial es FURIA"
            + "\n\nFURIA: El Barbaro entra en furia por 2 turnos para reducir el daño a la mitad tiene 3 turnos de enfriamiento";

    /*La clase barbaro tendra mas vida y mas defensa en promedio, 
    la habilidad especial es FURIA: entrar en furia por 2 turnos para reducir el daño a la mitad tiene 3 turnos de enfriamiento*/
    //CONSTRUCTORES
    public Barbaro(String nombre) {
        super(nombre, 12, 3, 10, 3, 8, 0.7);
        this.furia = false;
    }

    public Barbaro() {
        super();
        furia = false;
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

    //Solo se puede usar si no esta en furia y ya paso el enfriamiento
    public boolean puedeUsarFuria() {
        return !furia && enfriamiento == 0;
    }

    //FURIA: dura 2 turnos
    public void activarFuria() {
        if (puedeUsarFuria()) {
            furia = true;
            turnosFuria = 2;
        }
    }

    //Al acabar cada turno cuenta la furia; cuando termina empieza el enfriamiento de 3 turnos
    @Override
    public void finDeTurno() {
        if (furia) {
            turnosFuria--;
            if (turnosFuria == 0) {
                furia = false;
                enfriamiento = 3;
            }
        } else if (enfriamiento > 0) {
            enfriamiento--;
        }
    }

    @Override
    public String toString() {
        return "Barbaro{" + "nombre=" + getNombre() + ", fuerza=" + getFuerza() + ", defensa=" + getDefensa() + ", vida=" + getVida() + ", furia=" + furia + ", descripcion=" + descripcion + '}';
    }
    
    //Recibe daño quecomprueba furia
    @Override
    public int recibeDaño(int daño) {
        if (furia) {
            daño = Math.max(1, daño / 2);
        }
        return super.recibeDaño(daño);
    }

}
