/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04_colecciones;

import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author Sebas_work
 */
public class Almacen {
    
    private int ultimoCodigo;
    private TreeMap<Integer, Producto> mapaProductos;
    
    //CONSTRUCTOR
    public Almacen(){
        this.mapaProductos = new TreeMap();
        ultimoCodigo = 1001;
    }
    
    public void añadirProducto(Producto p){
        mapaProductos.put(ultimoCodigo, p);
        ultimoCodigo++;
    }
    
    public void modificarPrecio(Integer codigo, double precio){
        mapaProductos.get(codigo).setPrecio(precio);
        //System.out.println(mapaProductos.get(codigo-1).getPrecio());
    }
    
    public void añadirUnidades(Integer codigo, int unidades){
        mapaProductos.get(codigo).setUnidades(unidades);
    }
    
    public Producto obtenerProducto(Integer codigo){
        return mapaProductos.get(codigo);
    }
    
    public void venderProducto(Integer codigo, int unidades){
        int unidadesRestantes = mapaProductos.get(codigo).getUnidades() - unidades;
        mapaProductos.get(codigo).setUnidades(unidadesRestantes);
        if (mapaProductos.get(codigo).getUnidades() <= 10) {
            System.out.println("AVISO: QUEDAN MENOS DE DIEZ UNIDADES DE"+mapaProductos.get(codigo).getDescripcion());
        }
    }
    
    public void listarAlmacen(){
        Iterator<Integer> it = mapaProductos.keySet().iterator();
        
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println(mapaProductos.get(key));
        }
    }
    
    
    
    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }

    public TreeMap<Integer, Producto> getMapaProductos() {
        return mapaProductos;
    }

    public void setMapaProductos(TreeMap<Integer, Producto> mapaProductos) {
        this.mapaProductos = mapaProductos;
    }
 
    
    
    
}
