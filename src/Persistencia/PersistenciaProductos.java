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

    public static List<Producto> getArrayProductos() {
        return arrayProductos;
    }
    
    
}
