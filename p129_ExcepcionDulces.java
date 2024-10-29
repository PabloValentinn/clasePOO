import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class p129_ExcepcionDulces {
        public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        
        try {
            System.out.print("Numero de niños en el barrio: "); int a = obj.nextInt();
            System.out.print("Cantidad de dulces existente: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("A cada niño le tocan " + c + " Dulces");
            
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
            System.out.println("Si no hay dulces, no puedo repartir dulces");

        } finally {
            System.out.println(" ");
        }
    }
}