// p12_ConvertirTemperatura - Convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;
public class p12_ConvertirTemperatura {
    public static void main(String[] args) {
        double temperatura, grados;
        Scanner ltemperatura = new Scanner(System.in);

        System.out.println("\nConvirtiendo la temperatura a Grados Celsius\n");
        System.out.print("Dame la temperatura en Fahrenheit: ");
        temperatura = ltemperatura.nextFloat();

        grados = (temperatura - 32) * (5.0/9.0);

        System.out.println("\nLa temperatura de " + temperatura + " a grados celsius es " + grados);

       
    }
    
}
