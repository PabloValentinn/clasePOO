package p117_FiguraGeometrica;

public class Rectangulo implements FiguraGeometrica, Ajustar {
    private double alto, ancho;

    public Rectangulo(double alto, double ancho) {
    this.alto = alto;
    this.ancho = ancho; 
}
    @Override
    public double getArea() {
        return alto * ancho;
    }
    @Override
    public double getPerimetro() {
        return 2 * alto * ancho;
    }
    @Override
    public void ajustar(double porcentaje) {
        alto += alto * porcentaje;
        ancho += ancho * porcentaje;
        
    }
    @Override
    public String toString() {
        return "Rectangulo [alto=" + alto + ", ancho=" + ancho + ", Area=" + getArea() + ", Perimetro="
                + getPerimetro() + "]";
    }
    


}
