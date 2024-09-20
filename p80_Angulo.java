// p80_Angulo - Diseña un programa con una función que reciba como parámetro un ángulo entre 0 y 360 grados

import  java.util.Scanner;
public class p80_Angulo {
   
        public static int AnguloMedidas(int angulo) {
            if (angulo < 0 || angulo > 360) {
                System.out.println("Angulo invalido");
    
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
            return (angulo);
        }

        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.print("Dame un angulo entre 0 y 360 grados y te dire tu tipo: ");
        int angulo = new Scanner(System.in).nextInt();
        System.out.println(AnguloMedidas(angulo));

        
        }
       
        
}
    
    

