// p47_ConjeturaCollatz - Imprime los numeros de conjetura de collatz

import java.util.Scanner;

public class p47_ConjeturaCollatz {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprime los numeros de la conjetura de Collatz \n");
        System.out.print("Dame un numero entero: "); n = obj.nextInt();

       do {
            System.out.printf("%d ", n);
            if (n%2==0)
            n /= 2;
            
            else 
                n=n*3+1;
                
       } while (n != 1);
       System.out.printf("%d ",n);

    }
    
}
