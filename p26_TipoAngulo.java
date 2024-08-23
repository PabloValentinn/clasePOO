// p26_TipoAngulo - Determina el tipo de angulo en base a su magnitud
// >90 agudo, =90 recto, y <180 obtuso, =180 llano, >180 y <360 concavo

import java.util.Scanner;

public class p26_TipoAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame un angulo entre 0 y 360 grados y te dire tu tipo ");
        int angulo = new Scanner(System.in).nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("De cual fumasteeeeee");

        } else {
            System.out.println("El tipo de angulo es: ");
            if (angulo < 90)
                System.out.println("Agudo");
            if (angulo == 90)
                System.out.println("Recto");
            if (angulo > 90 && angulo < 180)
                System.out.println("Obtuso");
            if (angulo == 180)
                System.out.println("Llano");
            if (angulo > 180 && angulo < 360)
                System.out.println("Concavo");
            if (angulo == 360)
                System.out.println("Completo");

        }
    }

}
