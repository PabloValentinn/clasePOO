//  p11CalcularAngulo - Calcular el 3er ángulo de un triángulo dados los dos primeros ángulos

import java.util.Scanner;
public class p11_CalcularAngulo {
    public static void main(String[] args) {
        double angulo1, angulo2;
        double angulo3;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el tercer angulo de un triangulo:\n");
        System.out.print("Dame el primer angulo: ");
        angulo1 = obj.nextInt();
        System.out.print("Dame el segundo angulo: ");
        angulo2 = obj.nextInt();

        angulo3 = 180 - (angulo1+angulo2);


        System.out.println("Para un triangulo de angulo 1 " + angulo1 + " y como segundo angulo de " + angulo2 + " el tercer angulo es " + angulo3);


    }
    
    
    
}
