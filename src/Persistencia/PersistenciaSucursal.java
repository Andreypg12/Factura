package Persistencia;

import Factura.Factura;
import Factura.Sucursal;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaSucursal {
    private static final List<Sucursal> arraySucursales = new ArrayList<>();

    public PersistenciaSucursal() {
    }

    public static List<Sucursal> getArraySucursales() {
        return arraySucursales;
    }
    
    public static void agregarSucursal(Sucursal sucursal){
        arraySucursales.add(sucursal);
    }
    
    public static void eliminarSucursal(Sucursal sucursal){
        arraySucursales.remove(sucursal);
    }
    
    public static Sucursal getSucursal(Sucursal sucursal){
        for (Sucursal sucursales : arraySucursales) {
            if(sucursales.equals(sucursal)){
                return sucursales;
            }
        }
        return null;
    }
}
