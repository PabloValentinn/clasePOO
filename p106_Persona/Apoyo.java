package p106_Persona;

public class Apoyo extends Persona {
    private String Descripcion;
    private String Escolaridad;
    private double Paga;
    public Apoyo() {
    }
    public Apoyo(String nombre, String direccion, int edad, String descripcion, String escolaridad, double paga) {
        super(nombre, direccion, edad);
        Descripcion = descripcion;
        Escolaridad = escolaridad;
        Paga = paga;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getEscolaridad() {
        return Escolaridad;
    }
    public void setEscolaridad(String escolaridad) {
        Escolaridad = escolaridad;
    }
    public double getPaga() {
        return Paga;
    }
    public void setPaga(double paga) {
        Paga = paga;
    }
    @Override
    public String toString() {
        return "Apoyo [" + super.toString()+ ", Descripcion=" + Descripcion + ", Escolaridad=" + Escolaridad + ", Paga=" + Paga + "]";
    }

    

    

    
    
}
