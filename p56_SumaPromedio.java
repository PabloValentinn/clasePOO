// p56_SumaPromedio - 

import java.util.Scanner;

public class p56_SumaPromedio {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        float cal, suma, prom;
        int n,x;
        Scanner obj = new Scanner(System.in);
        boolean repite=true;

        while (repite) {

        System.out.println("Suma y promedio de n calificaciones");
        cal=suma=prom=0;
        System.out.print("Cuantas calificaciones deseas procesar: ");
        n = obj.nextInt();

        for (x=1; x <=n; x++) {
            System.out.print("Calificacion "+ x + "? ");
            cal = obj.nextFloat();
            suma += cal;
            
            prom = suma / n;
        
        }
        System.out.println("\nLa suma es: " + suma);
        System.out.println("\nEl promedio es: " + prom);


        System.out.println("\n Deseas repetir (s/n)? ");
        String resp = obj.next().toLowerCase();
        repite = resp.equals("s");
        }
    
    }   


    
}
