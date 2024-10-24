package p120_Vehiculo;

public class Maquina {
    private String nombre;
    private String propietario;
    private int pasajeros;
    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.pasajeros = pasajeros;
    }
    public String getNombre() {
        return nombre;
    }
    public String getPropietario() {
        return propietario;
    }
    public int getPasajeros() {
        return pasajeros;
    }

    public void Repostar(){
        System.out.println("Repostando...");
    }
    public void Arrancar(){
        System.out.println("Arrancando...");
    }
    public void Frenar(){
        System.out.println("Frenando...");
    }
    @Override
    public String toString() {
        return "Maquina [nombre=" + nombre + ", propietario=" + propietario + ", pasajeros=" + pasajeros + "]";
    }

    
}
