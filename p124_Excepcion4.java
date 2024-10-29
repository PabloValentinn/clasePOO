import java.util.InputMismatchException;
import java.util.Scanner;

public class p124_Excepcion4 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");

        
        try {
            System.out.print("Valor del numerador: "); int a = obj.nextInt();
            System.out.print("Valor del denominador: "); int b = obj.nextInt();
            int c = a/b;
            System.out.println("El resultado de la divisionn es: " + c);
            
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Tanto el numerador como el denominador deben ser numeros");
            System.out.println("No se puede dividir entre 0");
        } finally {
            System.out.println("\n Haya sido como haya sido acabaste");
        }
    }
    
}
