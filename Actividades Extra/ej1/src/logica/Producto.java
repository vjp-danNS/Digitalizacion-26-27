/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author alumno
 */
public class Producto {
    private int cantidad;
    private String nombre, categoria;

    public Producto(int cantidad, String nombre, String categoria) {
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    public Producto(){
        cantidad= 0;
        nombre="";
        categoria = "";
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "cantidad=" + cantidad + ", nombre=" + nombre + ", categoria=" + categoria + '}';
    }
    
    
}
