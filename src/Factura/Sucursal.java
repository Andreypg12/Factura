package Factura;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private List<Factura> arrayFacturas;
    private int codigo;
    private String nombre;

    public Sucursal(int codigo, String nombre) {
        arrayFacturas = new ArrayList<>();
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void agregarFactura(Factura factura){
        arrayFacturas.add(factura);
    }

    public List<Factura> getArrayFacturas() {
        return arrayFacturas;
    }
    
    public double mayorFactura(){
        double mayorPrecio = 0;
        for (Factura factura : arrayFacturas) {
            if (factura.calcularTotalFactura() > mayorPrecio) {
                mayorPrecio = factura.calcularTotalFactura();
            }
        }
        return mayorPrecio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Código = ").append(codigo);
        sb.append(" ").append(nombre);
        return sb.toString();
    }
}
