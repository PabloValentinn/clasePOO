// p14_CalculoTiempo - Calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class p14_CalculoTiempo {
    public static void main(String[] args) {

        double dias, minutos, segundo, horas; 

        System.out.println("\nCalculando el equivalente\n");
        System.out.print("Dame las horas: ");
        horas = new Scanner(System.in).nextDouble();

        dias = horas / 24;
        minutos = horas *60;
        segundo = horas * 360;

        System.out.println("Estas horas "+ horas + " en dias son "+ dias +" , en minutos son "+minutos+" y en segundos son "+segundo);




    
        
    }
    
}
