// p22_VerificarSuma - Verifica si la suma de un numero1 y un numer2 es igual a numero3

import java.util.Scanner;

public class p22_VerificarSuma {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("\nVerificando si la suma de dos numeros es igual a un tercero:\n");
        System.out.print("Dame numero 1: "); n1 = obj.nextInt();
        System.out.print("Dame numero 2: "); n2 = obj.nextInt();
        System.out.print("Dame numero 3: "); n3 = obj.nextInt();

        if (n1 + n2 == n3) {
            System.out.println("Son iguales");
            System.out.println(n1 + " + " + n2 + " = " + n3);

        }
        else 
        {
            System.out.println("Son distintos");
            System.out.println(n1 + " + " + n2 + " != " + n3);
        }
        
    }
    
}
