package p117_FiguraGeometrica;

public class App {
    public static void main(String[] args) {
        Circulo mCirculo = new Circulo(100);

        System.out.print("\033[H\033[2J");
        System.out.println("Probando Circulo");

        System.out.println(mCirculo);
        mCirculo.ajustar(0.03);
        System.out.println(mCirculo);

        Rectangulo miRectangulo = new Rectangulo(100, 200);
        System.out.println("\nProbando Rectangulo");
        System.out.println(miRectangulo);
        miRectangulo.ajustar(0.5);
        System.out.println(miRectangulo);
    }
    
}
