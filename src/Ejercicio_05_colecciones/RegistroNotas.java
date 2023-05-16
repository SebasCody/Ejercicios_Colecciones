/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_05_colecciones;

import Ejercicio_03_colecciones.agenda_hashmap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import static java.util.Map.entry;
import java.util.TreeMap;

/**
 *
 * @author Sebas_work
 */
public class RegistroNotas {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeMap<String, Double> mapaNotas = new TreeMap();
        
        añadirNota("Sebastian", 8.0, mapaNotas);
        Double notaDeAlumno = consultarNota("Sebastian", mapaNotas);        
        System.out.println(notaDeAlumno);
        
        for (Entry<String, Double> elemento : mapaNotas.entrySet()) {
            String nombreAlumno = elemento.getKey();
            Double notaAlumno = elemento.getValue();
            System.out.printf("Alumno: %s, Nota: %s", nombreAlumno, notaAlumno); System.out.println("");
        }
        
        
        
    }
    
//    @Override
//    public String toString(){
//        return String.format("%s %s", );
//    }
    
    public static void añadirNota(String codigoNombreAlumno, Double nota, TreeMap mapa){
        mapa.put(codigoNombreAlumno, nota);
        
    }
    
    public static Double consultarNota(String codigoNombre, TreeMap<String, Double> mapa){
        Double valorNota = mapa.get(codigoNombre).doubleValue();
        return valorNota;
    }
    
}
