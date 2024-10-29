import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p126_Excepcion6 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        System.out.print("Dame el nombre del archivo ");
        String nomarch = new Scanner(System.in).nextLine();

        
        try {
            File nombres = new File(nomarch);
            Scanner obj = new Scanner(nombres);
            while (obj.hasNextLine()) {
                System.out.println(obj.nextLine());
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
            
        }
    }

    
}
