//SumaParesImpares- suma pares o impares

import java.util.Scanner;

public class p73_SumaParesImpares {
    public static int SumaParImpar(int ini, int fin, char letra) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (letra == 'P' && i % 2 == 0) {
                System.out.printf("%d ", i);
                suma += i;
            } else if (letra == 'I' && i % 2 != 0) {
                System.out.printf("%d ", i);
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int ini, fin, suma;
        char poi;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Valor incial ? ");
        ini = obj.nextInt();
        System.out.print("Valor final ? ");
        fin = obj.nextInt();
        System.out.print("\n[P]ares \n[I]Impares ? ");
        poi = Character.toUpperCase(obj.next().charAt(0));
        suma = poi == 'P' ? SumaParImpar(ini, fin, 'P') : SumaParImpar(ini, fin, 'I');
        System.out.printf("\nLa suma es : %d", suma);
    }
}