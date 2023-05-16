/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01_colecciones;

import java.util.ArrayList;

/**
 *
 * @author Sebas_work
 */
public class Persona implements Comparable<Persona>{
    
    private String dni;
    private String nombre;
    private int edad;
    
    
    //CONSTRUCTOR
    public Persona(String dni, String nombre, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public void imprimirDetalles(){
        System.out.println("------- detalles de persona seleccionada-------");
        System.out.println("DNI:    "+this.dni);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad:   "+this.edad);
        System.out.println("-------------------------");

    }
    
//    @Override
//    public int compareTo(Persona o) {
//      
//      //Ordenamos por DNI  
//      if (this.dni.compareTo(o.getDni())<0)
//            return -1;
//      else if (this.dni.compareTo(o.getDni())>0)
//            return 1;
//      else {
//          return 0;
//      }
//    }
    
    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10d",dni,nombre,edad);
    }
    
    @Override
    public int compareTo(Persona o){
        if (edad < o.edad) {
            return -1;
        }
        
        if (edad > o.edad) {
            return 1;
        }
        return 0;
    }
    
    
    
    //GETTER AND SETTER
    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
