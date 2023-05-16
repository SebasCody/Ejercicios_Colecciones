/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02_colecciones;

import java.util.ArrayList;

/**
 *
 * @author Sebas_work
 */
public class Ferry{
    
    String nombre;
    ArrayList<Vehiculo> listaVehiculos;
    
    //CONSTRUCTOR/
    public Ferry(String nombre){
        
        this.nombre = nombre;
        this.listaVehiculos = new ArrayList<>();
    }
    
    //Añadir vehículo
    public boolean embarcarCoche(String matricula, String marca, String propietario){
        
        for (Vehiculo unVehiculo : listaVehiculos) {
            if (unVehiculo.getMatricula().equals(matricula)) {
                System.out.printf("\033[031mYa hay un coche con la matrícula %s. Revisa la matrícula.\033[030m", matricula);
                System.out.println("");
                return false;
            }
        }
        listaVehiculos.add(new Vehiculo(matricula, marca, propietario));
        System.out.printf("\033[032mVehículo con matricula %s añadido correctamente.\033[030m", matricula);
        System.out.println("");
        return true;
    }
    
    //Quitar vehículo
    public boolean desembarcarCoche(String matricula){
        
        for (Vehiculo unVehiculo : listaVehiculos) {
            if (unVehiculo.getMatricula().equals(matricula)) {
                listaVehiculos.remove(unVehiculo);
                System.out.printf("\033[032mVehículo con matricula %s retirado correctamente.\033[030m", matricula);
                System.out.println("");
                return true;
                
            }
            
        }
        
        System.out.printf("\033[031mNo hay ningún vehículo con la matrícula \033[035m%s\n", matricula);
        System.out.println("\033[031mRevisa la matrícula.\033[030m");
        return false;
    }
    
    public void listarVehiculos(){
        System.out.printf("%-10s %-10s %-10s", "Matricula", "Marca", "Propietario\n");
        for (Vehiculo aVehiculo : listaVehiculos) {
            System.out.println(aVehiculo);
        }
    }
    
    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    
}
