// p77_DiaSemana - Diseña un programa con una función que pida un número entero entre 1 y 7 
// y devuelva el día de la semana con
// letra. Deberá validar que el número está en el rango adecuado.

import java.util.Scanner;

public class p77_DiaDeLaSemana {

    public static String obtenerDiaDeLaSemana(int dia) {
        switch (dia) {
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miércoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sábado";
            case 7:
                return "Domingo";
            default:
                return "Número no válido";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        System.out.print("Introduce un número entre 1 y 7 para saber los dias de la semana: ");
        dia = scanner.nextInt();

        String nombreDia = obtenerDiaDeLaSemana(dia);
        System.out.println(nombreDia);
    }

}


    

