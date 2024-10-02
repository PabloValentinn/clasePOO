package p102_AutorLibro;

public class Libro {
    private String isbn;
    private String Nombre;
    private double Precio;
    private Autor Autor;
    public Libro() {
    }
    public Libro(String isbn, String nombre, double precio, p102_AutorLibro.Autor autor) {
        this.isbn = isbn;
        Nombre = nombre;
        Precio = precio;
        Autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public Autor getAutor() {
        return Autor;
    }
    public void setAutor(Autor autor) {
        Autor = autor;
    }
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Autor=" + Autor + "]";
    }

    
}
