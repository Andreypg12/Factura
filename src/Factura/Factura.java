package Factura;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<LineaDetalle> arrayLineaDetalle;
    private static int contFactura = 1;
    private int numeroFactura;
    private TipoFactura tipoFactura;
    private final float IVA = 0.13f;

    public Factura(TipoFactura tipoFactura) {
        this.arrayLineaDetalle = new ArrayList<>();
        this.numeroFactura = contFactura++;
        this.tipoFactura = tipoFactura;
    }
    
    public void agregarLineaDetalle(LineaDetalle lineaDetalle){
        arrayLineaDetalle.add(lineaDetalle);
    }
    
    public double calcularSubTotal(){
        double sumaCostos = 0;
        for (LineaDetalle lineaDetalle : arrayLineaDetalle) {
            sumaCostos += lineaDetalle.costoLineaDetalle();
        }
        
        return sumaCostos;
    }
    
    public double descuento(){
        if (tipoFactura.equals(TipoFactura.CONTADO)) {
            return calcularSubTotal() * 0.05;
        }
        else{
            return 0;
        }
    }
    
    public double calcularImpuesto(){
        return (calcularSubTotal() - descuento()) * IVA;
    }
    
    public double calcularTotalFactura(){
        return (calcularSubTotal() - descuento()) + calcularImpuesto();
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }
    
    public String display(){
        String formatoDosDecimales = "%.2f";
        
        String display = "# Factura: " + numeroFactura +
                "\nSub Total: " + String.format(formatoDosDecimales, calcularSubTotal()) + "₡" +
                "\nDescuento: " + String.format(formatoDosDecimales, descuento()) + "₡" +
                "\nImpuesto: " + String.format(formatoDosDecimales, calcularImpuesto()) + "₡" +
                "\nTotal: " + String.format(formatoDosDecimales, calcularTotalFactura()) + "₡" ;
        return display;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("N Factura: ").append(numeroFactura);
        sb.append(" - Total: ").append(String.format("%.2f", calcularTotalFactura())).append("₡");
        return sb.toString();
    }
    
}
