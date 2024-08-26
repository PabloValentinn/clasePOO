// p30_DiaSemana - Dado un numero entero entre 1 y 7, nos muestra el dia de la semana

import java.util.Scanner;

public class p30_DiaSemana {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("Dame un numero entre 1 y 7 y te dire el dia de la semana con letra ");
        int dia = new Scanner(System.in).nextInt();

        switch (dia) {
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Lunees"); break;
            case 3: System.out.println("Martes"); break;
            case 4: System.out.println("Mircoles"); break;
            case 5: System.out.println("Jueves"); break;
            case 6: System.out.println("Viernes"); break;
            case 7: System.out.println("Sabado"); break;
        
            default:
            System.out.println("NONONONO NOUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
                break;
        }
        System.out.println("\nGracias por utilizar este programa");
    }
    
}
