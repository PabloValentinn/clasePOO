package p105_PuntoTriangulo;

public class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;
    private double Perimetro;
    private String Tipo;
    public Triangulo() {
    }
    public Triangulo(Punto v1, Punto v2, Punto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Punto getV1() {
        return v1;
    }
    public void setV1(Punto v1) {
        this.v1 = v1;
    }
    public Punto getV2() {
        return v2;
    }
    public void setV2(Punto v2) {
        this.v2 = v2;
    }
    public Punto getV3() {
        return v3;
    }
    public void setV3(Punto v3) {
        this.v3 = v3;
    }
    public double getPerimetro() {
        double d1 = v1.getDistancia(v2);
        double d2 = v2.getDistancia(v3);
        double d3 = v3.getDistancia(v1);
            Perimetro = (d1 +d2 + d3);
            return Perimetro;
        }
    public String getTipo() {
        double d1 = v1.getDistancia(v2);
        double d2 = v2.getDistancia(v3);
        double d3 = v3.getDistancia(v1);
        if (d1 == d2 && d2 == d3) {
            return "Equilátero";
        } else if (d1 == d2 || d2 == d3 || d1 == d3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
    @Override
    public String toString() {
        return "Triangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }
    
}
