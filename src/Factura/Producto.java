package Factura;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private String nombre;
    private double precioBasico;
    private TipoProducto tipo;

    public Producto(String nombre, double precioBasico, TipoProducto tipo) {
        this.nombre = nombre;
        this.precioBasico = precioBasico;
        this.tipo = tipo;
    }
    
    public double calculaPrecioAdicional(){
        if (tipo.equals(TipoProducto.NACIONAL)) {
            return precioBasico * 0.1;
        }
        else{
            return precioBasico * 0.2;
        }
    }
    
    public double calculaPrecioTotal(){
        return precioBasico + calculaPrecioAdicional();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombre);
        sb.append(" precio: ").append(precioBasico);
        return sb.toString();
    }
    
    
    
    
}
