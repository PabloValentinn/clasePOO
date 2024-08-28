// p34_NumeroMayor - Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class p34_NumeroMayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        Scanner obj = new Scanner(System.in);

        int n1, n2 ,n3;

        System.out.println("\nComprobando cual numero es mayor");
        System.out.println("Dame numero 1: "); 
        n1 = obj.nextInt();
        System.out.println("Dame numero 2: "); 
        n2 = obj.nextInt();
        System.out.println("Dame numero 3: "); 
        n3 = obj.nextInt();

        if (n1 > n2 && n1 > n3) 
            System.out.println("El numero mayor es " +n1);
        else
            if (n2>n1 && n2 >n3) 
            System.out.println("El numero mayor es " +n2);
            else
                if (n3 > n1 && n3 > n2) 
             System.out.println("El numero mayor es " +n3);
                     else
                        System.out.println("Los numeros son iguales");


    }
    
}
