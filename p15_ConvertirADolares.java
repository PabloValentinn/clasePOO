// _p15_ConvertirADolares - obtener el equivalente en dólares.

import java.util.Scanner;

public class p15_ConvertirADolares {
    public static void main(String[] args) {  
        double pesos, dolares;
        Scanner lpesos = new Scanner(System.in);

        System.out.print("Dame la cantidad en pesos: "); 
        pesos = lpesos.nextFloat();

        dolares =  (pesos / 18.77);

        System.out.println("La cantidad de pesos a dolares es "+dolares);
        



    }


    
    
}
