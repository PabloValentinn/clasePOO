package p112_ControlVentas;

public abstract class  Venta {
    private String Articulo;
    private double Cantidad;
    private double Precio;
    private double Total;
    
    public Venta() {
    }

    public Venta(String articulo, double cantidad, double precio, double total) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = total;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public abstract double getTotalVenta();
    
}
