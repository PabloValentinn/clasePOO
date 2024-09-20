// p79_SumaMultiplos - Diseña un programa con una función que reciba tres parámetros y sus multiplos

import java.util.Scanner;
public class p79_SumaMultiplos {
   
        public static int SumaMultiplos(int ini, int fin, char letra) {
            int suma = 0;
            for (int i = ini; i <= fin; i++) {
                if (letra == '3' && i % ini == 0) {
                    System.out.printf("%d ", i);
                    suma += i;
                } else if (letra == '4' && i % ini == 0) {
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
            System.out.print("\n[3]Multiplo 3 \n[4]Multiplo 4 ");
            poi = Character.toUpperCase(obj.next().charAt(0));
            suma = poi == '3' ? SumaMultiplos(ini, fin, '3') : SumaMultiplos(ini, fin, '4');
            System.out.printf("\nLa suma es : %d", suma);

            obj.close();
        
    }
    
}
