// p85_NombreEdades - leer una serie de nombres y edades en los arreglos

import java.util.Scanner;
public class p85_NombreEdades {
    public static void main(String[] args) {
        int n=0, s=0, p=0;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.print("Cuantos elementos deseas procesar? "); n = obj.nextInt();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        System.out.println("Dame los nombres y edades de los "+ n + " elementos");
        for (int i=0; i < n; i++){
            obj.nextLine();
            System.out.println("Nombre = ");nombres[i] = obj.nextLine();
            System.out.println("Edad = ");edades[i] = obj.nextInt();
        }
        System.out.println("Los nombres y edades capturados son: ");
        for(int i=0; i<n; i++){
        System.out.println(nombres[i]+ " - " + edades[i]);
        s = s + edades[i];
    }

    p=s/n;
    System.out.println("\nEl promedio de edades es "+p);
   
   
    }

    
}
