// p76_NumeroMenor - Diseña un programa con una función que pida 4 
// números enteros y devuelva el menor de ellos.

import java.util.Scanner;

public class p76_NumeroMenor {

        public static float Menor(float n1,float n2,float n3, float n4) {


            float men=0;
                if( n1<n2 && n1<n3 && n1 < n4 ) men=n1;
                    else if( n2<n1 && n2<n3 && n2<n4 ) men=n2;
                        else if( n3<n1 && n3<n2 && n3 < n4) men=n3;
                            else if (n4 < n1 && n4 <n2 && n4<n3) men = n4;
                return men;
            }
                public static void main(String[] args) {
                    float n1,n2,n3, n4;
                    Scanner obj = new Scanner(System.in);
            
                    System.out.print("\033[H\033[2J");System.out.flush();
                    System.out.print("Dame tres numeros separados por espacio ? ");
                    n1 = obj.nextFloat(); n2 = obj.nextFloat(); n3 = obj.nextFloat(); n4 = obj.nextFloat();
                    System.out.printf("\nEl menor de los cuatros números es : %.2f",Menor(n1,n2,n3,n4));
    
                    obj.close();
         }
    

}
