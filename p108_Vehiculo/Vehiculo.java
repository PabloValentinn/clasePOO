package p108_Vehiculo;

public class Vehiculo {
    private String Serie;
    private String Marca;
    private int Año;
    private double Precio;
    
    public Vehiculo() {
    }

    public Vehiculo(String serie, String marca, int año, double precio) {
        Serie = serie;
        Marca = marca;
        Año = año;
        Precio = precio;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo [" + super.toString() + "Serie=" + Serie + ", Marca=" + Marca + ", Año=" + Año + ", Precio=" + Precio + "]";
    }
    
    
}
