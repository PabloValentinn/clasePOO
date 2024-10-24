package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        
        Sedan miSedan = new Sedan("Vochito", "Brayan Alexa", 4);
        Suv miSuv = new Suv("La mamalona", "Carlos Castañeda", 6);
        
        System.out.print("\033[H\033[2J");

        System.out.println(miSedan);
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.Repostar();
        miSedan.Arrancar();
        miSedan.Frenar();

        System.out.println("");

        System.out.println(miSuv);
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.Repostar();
        miSuv.Arrancar();
        miSuv.Frenar();

        
    }
    
}
