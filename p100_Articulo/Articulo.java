package p100_Articulo;

public class Articulo {
    private String id;
    private String desc;
    private int cant;
    private double precioUnit;

    public Articulo(String id, String desc, int cant, double precioUnit) {
        this.id = id;
        this.desc = desc;
        this.cant = cant;
        this.precioUnit = precioUnit;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getTotal() {
        return precioUnit * cant;
    }

    @Override
    public String toString() {
        return "Articulo [Id=" + id + ", Desc=" + desc + ", Cant=" + cant + ", PrecioUnit=" + precioUnit + "]";
    }
}
