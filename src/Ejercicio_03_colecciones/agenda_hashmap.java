/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_03_colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author Sebas_work
 */
public class agenda_hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        HashMap<String, String> agendaContacto = new HashMap();

        agendaContacto.put("Emergencias", "112");
        agendaContacto.put("Violencia de género", "016");
        agendaContacto.put("Mari Toni", "694451234");
        String arg1 = agendaContacto.get("Emergencias");
        String arg2 = agendaContacto.get("Violencia de género");
        String arg3 = agendaContacto.get("Mari Toni");

        System.out.println("**EJERCICIO 3 - AGENDA**");
        System.out.println("************************");
        System.out.printf("%20s %s %-15s\n", "Emergencias", "-->", arg1);
        System.out.printf("%20s %s %-15s\n", "Violencia de género", "-->", arg2);
        System.out.printf("%20s %s %-15s\n", "Mari Toni", "-->", arg3);
        System.out.println("************************");

        boolean salir = false;
        while (salir == false) {
            try {

                System.out.println("\n1. Añadir contacto");
                System.out.println("2. Eliminar contacto");
                System.out.println("3. Modificar contacto");
                System.out.println("4. Ver contacto");
                System.out.println("5. Listar todos los contactos");
                System.out.println("6. Salir");

                System.out.print("Elegir opcion: ");
                int opcion = Integer.parseInt(entrada.nextLine());
                System.out.println("");

                switch (opcion) {
                    case 1:
                        System.out.println(">>> AÑADIR CONTACTO ");
                        System.out.print("Introduce el nombre del contacto a añadir: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Introduce el teléfono del contacto: ");
                        String numTfno = entrada.nextLine();
                        agendaContacto.put(nombre, numTfno);
                        break;
                    case 2:
                        System.out.println(">>> Eliminar contacto <<<".toUpperCase());
                        System.out.print("Introduce el nombre del contacto a eliminar: ");
                        nombre = entrada.nextLine();
                        if (agendaContacto.containsKey(nombre)) {
                            agendaContacto.remove(nombre);
                        } else {
                            System.out.println("No existe ese contacto. El contacto debe estar en la agenda.");
                        }

                        break;
                    case 3:
                        System.out.println(">>> Modificar contacto <<<".toUpperCase());
                        System.out.println("¿Qué contacto quieres modificar? Introduce su nombre");
                        String nombreAModificar = entrada.nextLine();
                        boolean existeContacto = false;
                        do {
                            if (agendaContacto.containsKey(nombreAModificar)) {
                                existeContacto = true;
                            } else {
                                existeContacto = false;
                                System.out.println("El contacto no existe");
                                System.out.println("Revisa que esté bien escrito o que exista en la agenda.");
                            }

                        } while (existeContacto == false);
                        System.out.println("¿Quieres modificar la clave NOMBRE o el valor TELÉFONO?");

                        try {

                            boolean salirSubMenu = false;
                            while (salirSubMenu == false) {
                                System.out.print("Introduce [1] para Nombre o [2] para Teléfono:");
                                int opcionSubMenu = Integer.parseInt(entrada.nextLine());
                                System.out.println("");
                                switch (opcionSubMenu) {
                                    case 1:
                                        System.out.print("Introduce el nuevo nombre:");
                                        String nuevoNombre = entrada.nextLine();
                                        System.out.println("");
                                        String telefono = agendaContacto.get(nombreAModificar);

                                        agendaContacto.remove(nombreAModificar);
                                        agendaContacto.put(nuevoNombre, telefono);
                                        break;
                                    case 2:
                                        String telefonoAModificar = agendaContacto.get(nombreAModificar);
                                        System.out.print("Introduce el nuevo teléfono:");
                                        String nuevoTelefono = entrada.nextLine();
                                        System.out.println("");
                                        agendaContacto.replace(nombreAModificar, telefonoAModificar, nuevoTelefono);
                                        break;
                                    case 3:
                                        salirSubMenu = true;
                                        break;
                                    default:
                                        System.out.println("\033[031mElige una opción válida. >SubMenu<\033[030m");
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("\033[031mERROR: Elige una opción que sea un número. >SubMenu<\033[030m");
                        }
                        break;

                    case 4:
                        System.out.println(">>> Ver contacto <<<".toUpperCase());
                        System.out.print("¿Cuál es el nombre del contacto? Introdúcelo: ");
                        String contactoDetalles = entrada.nextLine();
                        if (agendaContacto.containsKey(contactoDetalles)) {
                            System.out.println("");
                            System.out.printf("%20s %s %-15s\n", contactoDetalles, "-->", agendaContacto.get(contactoDetalles));

                        } else {
                            System.out.println("El contacto no existe en la agenda.");
                        }
                        break;

                    case 5:
                        System.out.println(">>> LISTAR TODOS LOS CONTACTOS <<<");
                        //System.out.println("Lista de nombres<claves>:"+agendaContacto.keySet());
                        //IMPRIMIMOS CON UN ITERADOR
//                        Iterator<Map.Entry<String, String>> iterador = agendaContacto.entrySet().iterator();
//                        while (iterador.hasNext()) {
//                            Map.Entry<String, String> entry = iterador.next();
//                            String clave = entry.getKey();
//                            String valor = entry.getValue();
//                            System.out.println(clave + " --> "+ valor);
//                        }
                        
                        for (Entry<String, String> elemento: agendaContacto.entrySet()) {
                            String name = elemento.getKey();
                            String tfno = elemento.getValue();
                            System.out.println(name + " --> "+ tfno);
                        }
                        
                        break;
                    case 6:
                        salir = true;
                        break;

                    default:
                        System.out.println("\033[031mERROR: Elige una opción válida del 1 al 5.\033[030m");
                }
            } catch (Exception e) {
                System.out.println("\033[031mERROR: Elige una opción que sea un número.\033[030m");
            }

        }

    }

}
