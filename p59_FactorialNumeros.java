// p59_FactorialNumeros - Imprime el factorial de n numeros

import java.util.Scanner;

public class p59_FactorialNumeros {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.print("Hasta que numero deseas el factorial? "); int n = new Scanner(System.in).nextInt();

        int f = 1;
        int i,j;

        for (i=1; i <=n; i++) {
            System.out.printf("%d! = ",i);
            for (j=1; j <=i; j++) {
            System.out.printf("%d %s ", j ,(i==j ? "" : "*"));
            f=f*j;
        
        }
        System.out.printf("= %d ",f);
        System.out.println();

    }

}
    
}
