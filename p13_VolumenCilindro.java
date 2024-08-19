// VolumenCilindro - calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class p13_VolumenCilindro {

    public static void main(String[] args) {
        double radio, altura;
        double volumen;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el volumen de un cilindro:\n");
        System.out.print("Dame la altura: ");
        altura = obj.nextInt();
        System.out.print("Dame el radio: ");
        radio = obj.nextInt();

        volumen = Math.PI * ((radio * radio) * altura);

        System.out.println("Para un cilindro de radio " + radio + " y altura de " + altura + " el volumen es " + volumen);

    }
    
}
    

