package p108_Vehiculo;

public class Compacto extends Vehiculo {
    private int Pasajeros;
    private int Puertas;

    public Compacto(String serie, String marca, int año, double precio, int pasajeros, int puertas) {
        super(serie, marca, año, precio);
        Pasajeros = pasajeros;
        Puertas = puertas;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int puertas) {
        Puertas = puertas;
    }

    @Override
    public String toString() {
        return "Compacto [" + super.toString() + "Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }

    

    
}
