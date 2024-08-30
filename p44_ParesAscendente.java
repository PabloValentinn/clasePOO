// p44_ParesAscendente - imprime numeros pares desde 2 hasta n, repite el proceso varias veces

import java.util.Scanner;

public class p44_ParesAscendente {
    public static void main(String[] args) {
        int c,n,s;
         char resp;
         Scanner obj = new Scanner(System.in);

         do {
            System.out.print("\033[H\033[2J"); System.out.flush();

            c=2; n=s=0;
            System.out.print("Imprime pares de forma ascendente de 2 hasta 1\n");
            System.out.print("Hasta donde deseas los pares? "); n = obj.nextInt();
            while (c <=n) {
                System.out.printf("%d ", c);
                s +=c;
                c +=2;
                
            }
            System.out.printf("\n La suma de los pares hasta %d es %d ",n,s);

            
            System.out.print("Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

         } while (resp != 'N');
         System.out.println("\nProceso terminado");
    }
    
}
