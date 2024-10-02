package p104_PuntoCirculo;

public class Circulo {
    private Punto Centro;
    private double Radio;
    private double Area;
    private double Circunferencia;
    public Circulo() {
    }
    public Circulo(Punto centro, double radio, double area, double circunferencia) {
        Centro = centro;
        Radio = radio;
        Area = area;
        Circunferencia = circunferencia;
    }
    public Punto getCentro() {
        return Centro;
    }
    public void setCentro(Punto centro) {
        Centro = centro;
    }
    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        
        return Math.PI * Radio * Radio;
    }
    public void setArea(double area) {
        Area = area;
    }
    public double getCircunferencia() {
        return 2 * Math.PI * Radio;
    }
    public void setCircunferencia(double circunferencia) {
        Circunferencia = circunferencia;
    }
    @Override
    public String toString() {
        return "Circulo [Centro=" + Centro + ", Radio=" + Radio + ", Area=" + Area + ", Circunferencia="
                + Circunferencia + "]";
    }
    
}
