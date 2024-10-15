package p112_ControlVentas;

public class VentaContado {
    private double Descuento;
    private double Regalo;
    public VentaContado() {
    }
    public VentaContado(double descuento, double regalo) {
        Descuento = descuento;
        Regalo = regalo;
    }
    public double getDescuento() {
        return Descuento;
    }
    public void setDescuento(double descuento) {
        Descuento = descuento;
    }
    public double getRegalo() {
        return Regalo;
    }
    public void setRegalo(double regalo) {
        Regalo = regalo;
    }
   
   
    
    
}
