import java.util.Scanner;
import java.util.InputMismatchException;

public class p128_ExcepcionRaiz {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        float nuevoValor;
        
        try {
            System.out.print("Introduce un numero: ");
            float num = new Scanner(System.in).nextFloat();
            nuevoValor = (float) Math.sqrt(num);
            System.out.println("El resultado es: " + nuevoValor);
            
        } catch (InputMismatchException e) {
            System.out.println("Se tienen que colocar numeros, no letras");
        }
    }
    
}
