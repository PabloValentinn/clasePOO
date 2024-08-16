// p06_PromedioCalificaciones - Calcula la suma y el promedio de 3 calificaciones

import java.util.Scanner;

public class p06_PromedioCalificaciones {
    public static void main(String[] args) {
        float cal1, cal2, cal3;
        float suma, prom, min, max;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando el promedio de 3 calificaciones, tambien la mayor y menor de ellas:\n");
        System.out.print("Dame la calificacion 1: "); cal1 = obj.nextFloat();
        System.out.print("Dame la calificacion 2: "); cal2 = obj.nextFloat();
        System.out.print("Dame la calificacion 3: "); cal3 = obj.nextFloat();

        suma = cal1 + cal2 + cal3;
        prom = suma / 3;
        max = Math.max(Math.max(cal1,cal2),cal3);
        min = Math.min(Math.min(cal1,cal2),cal3);

        System.out.printf("\nLos valores de las calificaciones son: %.2f, %.2f, %.2f\n", cal1,cal2,cal3);
        System.out.printf("La suma es: %.2f\n", suma);
        System.out.printf("El promedio es: %.2f\n", prom);
        System.out.printf("La mayor es: %.2f\n", max);
        System.out.printf("La menor es: %.2f\n", min);

    }
    
}
