package Persistencia;

import Factura.Producto;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaProductos {
    
    private static final List<Producto> arrayProductos = new ArrayList<>();

    public PersistenciaProductos() {
    }
    
    public static void agregarProductos(Producto producto){
        arrayProductos.add(producto);
    }
    
    public static void eliminarProducto(Producto producto){
        arrayProductos.remove(producto);
    }
    
    public static boolean existe(String nombre){
        for (Producto producto : arrayProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public static Producto buscarPorNombre(String nombre){
        for (Producto producto : arrayProductos) {
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    public static List<Producto> getArrayProductos() {
        return arrayProductos;
    }
    
    
}
