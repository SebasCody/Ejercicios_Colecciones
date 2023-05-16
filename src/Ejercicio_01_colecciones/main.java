/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("55555555A", "Mortadelo", 18));
        listaPersonas.add(new Persona("44444444A", "Filemon", 17));
        
        
        boolean salir = false;
        do {
            System.out.println("     MENU     ");
            System.out.println("1. Añadir persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Detalles de persona");
            System.out.println("4. Listar todas las personas");
            System.out.println("5. Salir");
            System.out.print("ELIGE UNA OPCION: ");
            int opcion = Integer.parseInt(entrada.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println(">>> AÑADIR PERSONA <<<");
                    System.out.print("Añade nombre: ");
                    String nombre = entrada.nextLine();
                    System.out.println("");

                    System.out.print("Añadir DNI: ");
                    String dni = entrada.nextLine();
                    System.out.println("");

                    System.out.print("Añadir edad: ");
                    int edad = Integer.parseInt(entrada.nextLine());
                    System.out.println("");

                    listaPersonas.add(new Persona(dni, nombre, edad));
                    break;
                case 2:
                    System.out.println(">>> ELIMINAR PERSONA <<<");
                    System.out.print("Introduce el DNI de la persona a eliminar: ");
                    dni = entrada.nextLine();
                    System.out.println("");

                    if (eliminarPersona(dni, listaPersonas) == true) {
                        System.out.println("\033[034mPersona eliminada correctamente.\033[030m");
                    } else {
                        System.out.println("\033[031mNo se ha podido eliminar. Revisa el DNI o que la persona exista en la BBDD.\033[030m");
                    }

                    break;
                case 3:
                    System.out.println(">>> LISTAR DETALLES DE PERSONA <<<");
                    System.out.print("Introduce DNI de la persona a conocer detalles: ");
                    dni = entrada.nextLine();
                    System.out.println("");

                    for (Persona algunaPersona : listaPersonas) {
                        if (algunaPersona.getDni().equals(dni)) {
                            algunaPersona.imprimirDetalles();
                        } else {
                            System.out.println("\033[31mNo se encuentra dicha persona. \033[30m");
                        }
                    }

                    break;
                case 4:
                    System.out.println(">>> LISTAR A TODAS LAS PERSONAS <<<");
                    System.out.printf("%-10s %-10s %-10s", "DNI", "Nombre", "Edad");
                    System.out.println("");
                    Collections.sort(listaPersonas);
                    for (Persona personaEnLista : listaPersonas) {
                        System.out.println(personaEnLista);
                    }
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("\033[031mElige una opción válida\033[030m");
            }

        } while (!salir);

    }

    //FUNCION ELIMINAR PERSONA
    private static boolean eliminarPersona(String dni, ArrayList<Persona> listaPersonas) {

        for (Persona algunaPersona : listaPersonas) {

            if (algunaPersona.getDni().equals(dni)) {
                listaPersonas.remove(algunaPersona);
                return true;
            }

        }
        return false;
    }
}
