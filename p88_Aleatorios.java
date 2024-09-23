// p88_Aleatorios - Genera números aleatorios

import java.util.Random;

public class p88_Aleatorios {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a1 = rnd.nextInt(); //Genera un numero aleatorio en el rango de los numeros enteros
        int a2 = rnd.nextInt(30)+1;
        int min =10;
        int max =30;
        int a3 = rnd.nextInt(max - min + 1)+ min;

        System.out.print("\033[H\033[2J");
        System.out.println("Numero entero aleatorio positivo: " + Math.abs(a1));
        System.out.println("Numero entero aleatorio 1..30 : " + Math.abs(a2));
        System.out.println("Numero entero aleatorio 10..30 : " + Math.abs(a3));
    }
    
}
