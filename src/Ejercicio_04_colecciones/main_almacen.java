/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_04_colecciones;

/**
 *
 * @author Sebas_work
 */
public class main_almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Almacen miAlmacen = new Almacen();
        miAlmacen.añadirProducto(new Producto("iPhone 14 Pro Max", 14, 1199));
        miAlmacen.añadirProducto(new Producto("Pixel 7 Pro", 10, 850));
        
         miAlmacen.modificarPrecio(1002, 950);
         
         miAlmacen.listarAlmacen();
    }
    
}
