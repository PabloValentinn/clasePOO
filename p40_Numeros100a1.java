// p40_Numeros100a1 - Imprime numeros de n decrementando en d usando while

import java.util.Scanner;

public class p40_Numeros100a1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Imprimiendo numeros de n a d \n");
        System.out.println("Desde donde deseas descender? ");
        int c = new Scanner(System.in).nextInt();
        
        System.out.println("Decremento de? ");
        int d = new Scanner(System.in).nextInt();

        while (c >= 1) {
            System.out.printf("%d ", c);
            c = c-d;
            
        }
        System.out.println("El ciclo ha terminado... ");
        System.out.println(c);
    }
    
}
