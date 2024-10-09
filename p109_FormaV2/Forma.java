package p109_FormaV2;

public abstract class Forma {
    private String Color;
    private boolean relleno;

    public Forma() {}

    public Forma(String color, boolean relleno) {
        Color = color;
        this.relleno = relleno;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public boolean isRelleno() {
        return relleno;
    }
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    public abstract double getArea();
    public abstract double getPerimetro();

    @Override
    public String toString() {
        return "Forma [Color=" + Color + ", relleno=" + relleno + "]";
    }
}