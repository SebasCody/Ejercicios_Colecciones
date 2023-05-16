/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04_colecciones;

/**
 *
 * @author Sebas_work
 */
public class Producto {
    
    private String descripcion;
    private double precio;
    private int unidades;
    
    //CONSTRUCTOR
    public Producto(String descripcion, int unidades, double precio){
        
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precio = precio;
        
    }
    
    @Override
    public String toString(){
        return String.format("%-10s   %10.2f€   %d unidades\n",descripcion,precio,unidades);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
}
