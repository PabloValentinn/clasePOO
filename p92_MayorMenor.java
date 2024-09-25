//p92_MayorMenor - capturar n números en un arreglo de números enteros.

import java.util.Scanner;
public class p92_MayorMenor {
    public static void Mostrar(int[] x) {
        System.out.println("Los numeros capturados son: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }  
        public static int Mayor(int[] x){
            int m = x[0];
            for(int i=1; i <x.length; i++)
                if (x[i] > m) m=x[i];
                return m;        
        }
        public static int Menor(int[] x){
            int m = x[0];
            for(int i=1; i <x.length; i++)
                if (x[i] < m) m=x[i];
                return m;     
        }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("¿Cuántos numeros deseas agregar? : ");
        int n = obj.nextInt();

        int[] num = new  int[n];
        int suma = 0, p = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Numero #" + (i + 1) + ": "); num[i] = obj.nextInt(); 
            suma += num[i];
        }
        Mostrar(num); 
        System.out.println("\nEl mayor es " + Mayor(num) );
        System.out.println("El menor es " + Menor(num) );

    }
}