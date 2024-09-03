// p48_ImparesAscendente - imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida

import java.util.Scanner;

public class p48_ImparesAscendente {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int c,n,s,d;
         char resp;
         Scanner obj = new Scanner(System.in);

         do {

            c=1; n=d=s=0;
            System.out.print("Imprime impares de forma ascendente de 1 hasta n\n");
            System.out.print("Hasta donde deseas los impares? "); n = obj.nextInt();
            while (c <=n) {
                System.out.printf("%d ", c);
                s +=c;
                c +=2;
                
            }
            System.out.printf("\n La suma de los impares hasta %d es %d ",n,s);

            
            System.out.print("Deseas continuar (S/N)? ");
            resp = Character.toUpperCase(obj.next().charAt(0));

         } while (resp != 'N');
         System.out.println("\nProceso terminado");
    }
        
    
    
}
