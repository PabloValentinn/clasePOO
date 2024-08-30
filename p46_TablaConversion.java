// p46_TablaConversion - Imprime tabla de conversion de peso a dolar en un rango determinado

import java.util.Scanner;
public class p46_TablaConversion {
    public static void main(String[] args) {
        int ini, fin, c;
        float tc =18.74f, te = 25.00f;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Tabla de conversion de $ Peso a $ Dolar");
        do {       
            do {
            System.out.print("Dame inicio   :   "); ini = obj.nextInt();
            System.out.print("Dame fin      :   "); fin = obj.nextInt();
        } while (fin < ini);

        c = ini;
        System.out.println("Peso \t\t Dollar \t euro");
        System.out.println("============================================");
        while (c <= fin) {
            System.out.printf("%10d  =  %10.2f  \t %10.2f\n", c, c * tc, c * te);
            c++;
        }
        System.out.println("============================================");
        System.out.print("Deseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
    }
}