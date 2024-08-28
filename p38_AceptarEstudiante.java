// p38_AceptarEstudiante-v2 - decidir si el estudiante es aceptado.
import java.util.Scanner;

public class p38_AceptarEstudiante {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        String nombre, sexo;
        float cal1, cal2, cal3, calFinal;
        int edad;

        Scanner obj = new Scanner(System.in);

        System.out.println("Evaluando tu ingreso a la universidad\n");
        System.out.print("Dame tu nombre: "); nombre=obj.nextLine();
        System.out.print("Dame tu sexo (hombre/mujer): "); sexo=obj.nextLine();
        System.out.print("Dame tu edad: "); edad=obj.nextInt();
        System.out.print("Dame la calificacion 1: ");
        cal1 = obj.nextFloat();
        System.out.print("Dame la calificacion 2: ");
        cal2 = obj.nextFloat();
        System.out.print("Dame la calificacion 3: ");
        cal3 = obj.nextFloat();

        calFinal = (cal1 + cal2 +cal3)/3;


        if (calFinal >= 8 && calFinal <=9.5f && edad > 21 && sexo == "mujer" ) {
            System.out.println("La Universidad Kitty Kat SA te ha aceptado");
            
        }
        else
        System.out.println("No cumples con los requisitos para entrar a esta universidad");
    }
    
}
