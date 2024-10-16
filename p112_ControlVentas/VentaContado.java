package p112_ControlVentas;

public class VentaContado extends Venta {
    private double Descuento;
    private String Regalo;
    public VentaContado(String articulo, int cantidad, double precio, double descuento, String regalo) {
        super(articulo, cantidad, precio);
        Descuento = descuento;
        Regalo = regalo;
    }
    @Override
    public double getTotalVenta() {
        Total = Total - (Total * Descuento);
        return Total;
    }
    @Override
    public String toString() {
        return "VentaContado [" + super.toString() + "Descuento=" + Descuento + ", Regalo=" + Regalo + ", Total=" + getTotalVenta() + "]";
    } 

    

    
    
   
   
    
    
}
