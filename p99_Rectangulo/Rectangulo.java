package p99_Rectangulo;

public class Rectangulo {
    private float largo;
    private float ancho;

    public Rectangulo() {
    }

    public Rectangulo(float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getArea() {
        return largo * ancho;
    }

    public float getPerimetro() {
        return 2 * (largo + ancho);
    }

    @Override
    public String toString() {
        return "Rectangulo [Largo=" + largo + ", Ancho=" + ancho + "]";
    }
}
