package p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais");
        Perico miPerico = new Perico("Chip");

        System.out.print("\033[H\033[2J");
        System.out.println("Mi perro se llama " + miPerro.getNombre());
        miPerro.respiracion();
        miPerro.movimiento();
        miPerro.crecimiento();
        miPerro.multiCelular();
        miPerro.sangreCaliente();
        miPerro.correr();
        miPerro.cuatroPatas();
        System.out.println("");

        System.out.println("Mi perico se llama "+ miPerico.getNombre());
        miPerico.respiracion();
        miPerico.movimiento();
        miPerico.crecimiento();
        miPerico.multiCelular();
        miPerico.sangreCaliente();
        miPerico.volar();
        miPerico.dosPatas();
    }
    
}
