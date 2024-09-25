// p93_ParesImpares - SumaPares e Impares de arreglos

import java.util.Random;

public class p93_ParesImpares {
    public static void GenialAleatorio(int[] x){
        int min=1, max = 20;
        for(int i=0; i<x.length; i++)
            x[i] = new Random().nextInt(max - min)+min;
       
    }

    public static void Mostrar(int[] x){
        for(int i=0; i<x.length; i++)
        System.out.printf("%d ",x[i]);
        System.out.println();
    }

    
      
    public static void main(String[] args) {
        int MAX1 = 20;
        int MAX2 = 100;
        int suma =0;
        int suma2 =0;
        StringBuilder pares = new StringBuilder();
        StringBuilder impares = new StringBuilder();
        int[] a = new int[MAX1];
        int[] b = new int[MAX2];

        System.out.print("\033[H\033[2J");
        GenialAleatorio(a);
        System.out.println("Rellenado el arreglo a[] con números aleatorios entre 0 y 20:");
        Mostrar(a);

            for (int num : a) {
                if (num % 2 == 0) { 
                    pares.append(num).append(" "); 
                    suma += num;
                }
        }

        System.out.println("\nNúmeros pares: " + pares.toString().trim());
            System.out.println("Suma de números pares: " + suma);

            for (int num : a) {
                if (num % 2 != 0) { 
                    impares.append(num).append(" "); 
                    suma2 += num;
                }
        }

        System.out.println("\nNúmeros Impares: " + impares.toString().trim());
            System.out.println("Suma de números impares: " + suma2);
    }
    
    
}
