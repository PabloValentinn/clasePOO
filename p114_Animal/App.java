package p114_Animal;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Gato miGato = new Gato();

        miGato.sonido();
        miGato.dormir();
    }
    
}
