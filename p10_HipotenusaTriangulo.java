// HipotenusaTriangulo - Calcular la hipotenusa de un triangulo

import java.util.Scanner;

public class p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        double hipotenusa;
        int lado1, lado2;
        Scanner obj = new Scanner(System.in);


        System.out.println("\nCalculando la hipotenusa de un traingulo\n");
        System.out.print("Ingrese la longitud del primer lado: "); 
        lado1 = obj.nextInt();
        System.out.print("Ingrese la longitud del segundo lado: "); 
        lado2 = obj.nextInt();

        hipotenusa = Math.sqrt((lado1 * lado2) + (lado2*lado2));

        System.out.println("Para un triangulo de lado " + lado1 + " y su segundo lado de " + lado2 + " la hipotenusa es " + hipotenusa);
         

        
        

    }
    
}
