package p109_FormaV2;

public class App {
    public static void main(String[] args) {
        Circulo c1 = new Circulo("Rojo", true, 10.23);
        Circulo c2 = new Circulo("Verde", false, 99.12);
        Rectangulo r1 = new Rectangulo("Amarillo", false, 10.0, 20.0);
        Rectangulo r2 = new Rectangulo("Azul", true, 15.0, 44.0);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("\nCalculando areas y perimetros de las figuras: ");
        System.out.println(
                "La forma es un circulo \nEl area es     :" + c1.getArea() + "\nEl perimetro es: " + c1.getPerimetro());
        System.out.println(
                "La forma es un circulo \nEl area es     :" + c2.getArea() + "\nEl perimetro es: " + c2.getPerimetro());
        System.out.println("La forma es un Rectangulo \nEl area es     :" + r1.getArea() + "\nEl perimetro es: "
                + r1.getPerimetro());
        System.out.println("La forma es un Rectangulo \nEl area es     :" + r2.getArea() + "\nEl perimetro es: "
                + r2.getPerimetro());
    }
}