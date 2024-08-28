// p35_ContinentesMundo - 

import java.util.Scanner;

public class p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Dame un numero entre 1 y 6 y te mostrare el continente que es: ");
        int num = new Scanner(System.in).nextInt();

        switch (num) {
            case 1: System.out.println("Asia"); break;
            case 2: System.out.println("Africa"); break;
            case 3: System.out.println("America del Norte"); break;
            case 4: System.out.println("America del Sur"); break;
            case 5: System.out.println("Antartida"); break;
            case 6: System.out.println("Europa"); break;
        
            default:
            System.out.println("Numero Invalido");
                break;
        }
        System.out.println("\nGracias por usarme");
    }
    
}
