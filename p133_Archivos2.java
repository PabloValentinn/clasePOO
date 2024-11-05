import java.io.*;
public class p133_Archivos2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        String[] ciudades = {"Zacatecas", "Fresnillo", " Cd Guzman", "Rio Grande", "Guadalajara", " Novolato", "Zacatlan"};
        File arch = new File("ciudades.txt");

        if (! arch.exists()) {
            System.out.println("No existe");
            try {
                BufferedWriter fciudades = new BufferedWriter(new FileWriter(arch));
                for (String ciudad : ciudades) {
                    fciudades.write(ciudad + " \n");
                    
                }
                fciudades.close();
            } catch (Exception e) {
                System.out.println("Hubo error al manipular el archivo" + e.getMessage());
            }
        }
         else
         System.out.println("El archivo ya existe..");
    }
    
}
