package p104_PuntoCirculo;

public class Punto {
    private int X;
    private int Y;
    private double Distancia;
    public Punto() {
    }
    public Punto(int x, int y, double distancia) {
        X = x;
        Y = y;
        Distancia = distancia;
    }
    public int getX() {
        return X;
    }
    public void setX(int x) {
        X = x;
    }
    public int getY() {
        return Y;
    }
    public void setY(int y) {
        Y = y;
    }
    public double getDistancia(Punto otro) {
        double distancia;
        distancia = Math.sqrt(Math.pow((otro.X - this.X), 2) + Math.pow((otro.Y - this.Y), 2));

        return distancia;
    }
    public void setDistancia(double distancia) {
        Distancia = distancia;
    }
    @Override
    public String toString() {
        return "Punto [X=" + X + ", Y=" + Y + ", Distancia=" + Distancia + "]";
    }
    
    
}
