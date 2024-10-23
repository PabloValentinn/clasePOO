package p117_FiguraGeometrica;

public class Circulo implements FiguraGeometrica, Ajustar {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void ajustar(double porcentaje) {
        radio += radio * porcentaje;
        
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", Area=" + getArea() + ", Perimetro=" + getPerimetro() + "]";
    }
    
    
}
