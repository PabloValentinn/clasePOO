package p145_EstudiantesGUI_v1;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private int edad;
    private double peso;
    private String correo;
    public Estudiante() {
    }
    public Estudiante(String nombre, int edad, double peso, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.correo = correo;
    }
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

    

    
}
