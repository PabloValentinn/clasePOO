//  p60_SumaTerminos - 

import java.util.Scanner;

public class p60_SumaTerminos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        float f = 1;
        int i,j,n;
        float s = 0;

        System.out.print("Hasta que numero deseas el factorial? "); n = new Scanner(System.in).nextInt();


        for (i=1; i <=n; i++) {
            System.out.printf("1 / ");
            for (j=1; j <=i; j++) {
            f=f*j;
         }
         s=s+1/f;
         System.out.printf("%.0f %s",f, (i==n?" ":"+"));
        

        }
        System.out.printf(" = %f", s);

    }
    
}
