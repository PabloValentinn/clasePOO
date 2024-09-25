// p91_MayoresPromedio - Permita al usuario capturar n calificaciones en un arreglo de números flotantes.

import java.util.Scanner;

public class p91_MayoresPromedio {

    public static void Mostrar(double[] x) {
        System.out.println("Las calificaciones capturadas son: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
    public static void MayoresAlPromedio(double[] x, double promedio) {
        System.out.print("Números mayores que el promedio: ");
        boolean hayMayores = false;
        for (double num : x) {
            if (num > promedio) {
                System.out.print(num + " ");
                hayMayores = true;
            }
            else break;}
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");

        System.out.print("¿Cuántas calificaciones deseas agregar? : ");
        int n = obj.nextInt();

        double[] calif = new double[n];
        double suma = 0, p = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": "); calif[i] = obj.nextDouble(); 
            suma += calif[i];
        }

        Mostrar(calif); 
        
        p = suma / n; 
        System.out.println("\nEl promedio de calificaciones es " + p);

        MayoresAlPromedio(calif, p);
    }
}