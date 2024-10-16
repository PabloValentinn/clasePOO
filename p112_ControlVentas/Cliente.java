package p112_ControlVentas;

import java.util.ArrayList;

public class Cliente {
    private String Nombre;
    private String Domicilio;
    private String Correo;
    private ArrayList<Venta> Ventas;



    public Cliente(String nombre, String domicilio, String correo) {
        Ventas = new ArrayList<>();
        Nombre = nombre;
        Domicilio = domicilio;
        Correo = correo;
    }

    public void agregarVenta(Venta venta){
        Ventas.add(venta);
    }

    

    public ArrayList<Venta> getVentas() {
        return Ventas;
    }

    public double getTotal() {
        double total = 0;
        for (Venta venta : Ventas){
            total = total + venta.getTotalVenta();
        }
        return total;

    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + Nombre + ", Domicilio=" + Domicilio + ", Correo=" + Correo + ", Ventas=" + Ventas.size()
                + ", Total =" + getTotal() + "]";
    }  
    
    
}
