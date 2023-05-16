/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02_colecciones;

/**
 *
 * @author Sebas_work
 */
public class Vehiculo implements Comparable<Vehiculo>{
    
    private String matricula;
    private String marca;
    private String propietario;
    
    //CONSTRUCTOR
    public Vehiculo (String matricula, String marca, String propietario){
        
        this.matricula = matricula;
        this.marca = marca;
        this.propietario = propietario;
        
    }
    
    @Override
    public String toString(){
        return String.format("%-10s %-10s %-10s", matricula, marca, propietario);
    }
    
    @Override
    public int compareTo(Vehiculo o){
        if (this.matricula.compareTo(o.matricula) < 0) {
            return -1;
        }
        if (this.matricula.compareTo(o.matricula) > 0) {
            return 1;
        }
        else{
            return 0;
        }
    }
    
    //GETTER AND SETTER
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
}
