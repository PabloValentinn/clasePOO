// p21_VerificarNumero - Verificar si un numero es positivo o negativo

import java.util.Scanner;

public class p21_VerificarNumero {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("Verificando si un numero es positivo o negativo o cero \n");
        System.out.print("Dame un numero entero: ");
        int numero = new Scanner(System.in).nextInt();

        if(numero>0) System.out.println("El numero "+numero+ " es positivo");
        if(numero<0) System.out.println("El numero "+numero+ " es negativo");
        if(numero==0) System.out.println("El numero "+numero+ " es cero");
        
    }
    
}
