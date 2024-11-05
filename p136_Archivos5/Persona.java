package p136_Archivos5;
import java.io.Serializable;

public class Persona implements Serializable { // permite serializar los datos para grabarlos en un archivo
    private String nombre;
    private int edad;
    private double peso;
    private String correo;

    public Persona() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", correo=" + correo + "]";
    }

    
    
}
