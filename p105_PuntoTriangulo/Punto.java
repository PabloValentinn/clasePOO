package p105_PuntoTriangulo;

public class Punto {
    private int x;
    private int y;
    private double Distancia;
    public Punto() {
    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double getDistancia(Punto otro) {
        Distancia = Math.sqrt(Math.pow(otro.getX() - this.x, 2) + Math.pow(otro.getY() - this.y, 2));
        return Distancia;
    }
    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }
}
