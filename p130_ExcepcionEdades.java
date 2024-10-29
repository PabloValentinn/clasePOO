import java.util.InputMismatchException;
import java.util.Scanner;

public class p130_ExcepcionEdades {
        public static void main(String[] args) {
        int[] edades = new int[5];
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.println("Captura las edades de 5 personas: ");

        for (int i = 0; i < 5; i++) {
            while (true) {
                try {
                System.out.print("Ingrese la edad de la persona " + (i + 1) + ": "); edades[i] = obj.nextInt();
                break;
                } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                obj.next();
            }
        }
    }
    System.out.println("\nCaptura terminada, las edades son...");
    for (int i = 0; i < edades.length; i++) {
        System.out.print(edades[i]);
        if (i < edades.length - 1) {
            System.out.print(" "); 
        }
    }
}
}