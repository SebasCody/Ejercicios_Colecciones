/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_02_colecciones;

import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class main_ferry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        Ferry unFerry = new Ferry("Amanecer por el Ocaso");
        unFerry.embarcarCoche("8488KVY", "Dacia", "Sebastian Peralta");
        unFerry.embarcarCoche("8875GZC", "Renault", "Sebastian Peralta");
        System.out.println("COCHES EMBARCADOS:");
        unFerry.listarVehiculos();

        unFerry.desembarcarCoche("8488KVY");
        unFerry.desembarcarCoche("8875GZB");
        System.out.println("COCHES TRAS EL DESEMBARCO:");

        unFerry.listarVehiculos();

        System.out.println("\n** EJERCICIO 2 - ARRAYLIST FERRY **");
        System.out.println("\033[033m" + unFerry.getNombre() + "\033[030m");
        System.out.println("***********************************");

        boolean salir = false;
        String matricula, marca, propietario;
        
        while (!salir) {
            System.out.println("\n1. Embarcar vehículo");
            System.out.println("2. Desembarcar vehículo");
            System.out.println("3. Datos de un vehículo embarcado");
            System.out.println("4. Listar vehículos embarcados");
            System.out.println("5. Salir\n");
            
            try {
                System.out.print("\nIntroduce un número de opción: ");
                int opcion = Integer.parseInt(entrada.nextLine());
                switch (opcion) {
                    case 1:
                        System.out.println(">>> EMBARCAR VEHÍCULO <<<");
                        // Pedimos los datos por consola
                        System.out.print("Introduce el propietario del vehículo: ");
                        propietario = entrada.nextLine();
                        System.out.print("Introduce la marca del vehículo: ");
                        marca = entrada.nextLine();
                        System.out.print("Introduce la matrícula del vehículo: ");
                        matricula = entrada.nextLine();
                        unFerry.embarcarCoche(matricula, marca, propietario);
                        break;
                        
                    case 2:
                        System.out.println(">>> DESEMBARCAR VEHÍCULO <<<");
                        System.out.print("Introduce la matrícula del vehículo: ");
                        String matriculaDesembarcar = entrada.nextLine();
                        unFerry.desembarcarCoche(matriculaDesembarcar);
                        break;
                        
                    case 3:
                        System.out.println(">>> Datos de un vehículo embarcado <<<".toUpperCase());
                        System.out.print("Introduce la matrícula del vehículo: ");
                        matricula = entrada.nextLine();
                        
                        boolean encontrado = false;
                        for (Vehiculo unVehiculo : unFerry.getListaVehiculos()) {
                            if (unVehiculo.getMatricula().equals(matricula)) {
                                System.out.printf("%-10s %-10s %-10s", "Matricula", "Marca", "Propietario\n");        
                                System.out.println(unVehiculo);
                                encontrado = true;
                                
                            }else if(encontrado = false){
                                System.out.printf("\033[031mNo hay ningún vehículo con la matrícula \033[035m%s\n", matricula);
                                System.out.println("\033[031mRevisa la matrícula.\033[030m");
                            }
                        }
                        
                        break;
                        
                    case 4:
                        System.out.println(">>> Listar vehículos embarcados <<<".toUpperCase());
                        unFerry.listarVehiculos();
                        break;
                    case 5:
                        System.out.println(">>> SALIR DEL PROGRAMA <<<");
                        salir = true;
                        break;
                    default:
                        System.out.println("\033[031m ERROR: Introduce un número de opción válido\033[030m");

                }
            } catch (Exception e) {
                System.out.println("\033[031m ERROR: SOLO SE PERMITEN NÚMEROS. \033[030m " + e.getMessage());

            }
        }
    }

}


