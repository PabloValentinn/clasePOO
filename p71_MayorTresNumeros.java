// p71_MayorTresNumeros - Imprime el mayor de los tres numeros

import java.util.Scanner;
public class p71_MayorTresNumeros {
    public static float Mayor(float n1,float n2,float n3) {


float may=0;
    if( n1>n2 && n1>n3 ) may=n1;
        else if( n2>n1 && n2>n3 ) may=n2;
            else if( n3>n1 && n3>n2 ) may=n3;
    return may;
}
    public static void main(String[] args) {
        float n1,n2,n3;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Dame tres numeros separados por espacio ? ");
        n1 = obj.nextFloat(); n2 = obj.nextFloat(); n3 = obj.nextFloat();
        System.out.printf("\nEl mayor de los tres números es : %.2f",Mayor(n1,n2,n3));
}
}
