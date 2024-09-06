// p61_SecuenciaNumeros1 - imprimir la secuencia de números mostrados el número de renglones que el usuario desee

import java.util.Scanner;

public class p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
         System.out.print("\033[H\033[2J"); System.out.flush();

        int i,j;
        Scanner obj = new Scanner(System.in);

        System.out.print("De cuantos renglones? "); int r = obj.nextInt();
        //System.out.print("De que caracter? "); char c = obj.next().charAt(0);

        for(i = 1; i<=r; i++) {

            for(j = 1; j <=i; j++)
                System.out.print(i + " ");

            System.out.println();

        }
        obj.close();
        
    }
    
}
