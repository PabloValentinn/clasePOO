package p106_Persona;

public class Persona {
    private String Nombre;
    private String Direccion;
    private int Edad;

    public Persona(){}
    public Persona(String nombre, String direccion, int edad){
        Nombre = nombre;
        Direccion = direccion;
        Edad = edad;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int edad) {
        Edad = edad;
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + Nombre + ", Direccion=" + Direccion + ", Edad=" + Edad + "]";
    }

    
}
