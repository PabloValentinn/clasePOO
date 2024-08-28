// p39_Numeros1a100 - Imprimir numeros del 1 al 100 con while

import java.util.Scanner;

public class p39_Numeros1a100 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprimiendo los numeros del 1 al n ");
        System.out.println("Hasta donde? "); int n = new Scanner(System.in).nextInt();
        System.out.println("En incremento de ? "); int i = new Scanner(System.in).nextInt();


        int c = 1 ;

        while (c <= n) {
            System.out.printf("%d ", c);
            c = c+i;
            
        }
        
    
    }
    
}
