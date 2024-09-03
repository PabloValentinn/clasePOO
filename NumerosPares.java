// p49_ParesDescendente - imprimir los números pares desde 100 hasta el número que el usuario decida

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Introduce el número límite (n): ");
            int n = scanner.nextInt();

            if (n < 100) {
                System.out.println("El número debe ser mayor o igual a 100.");
                continue;
            }

            int suma = 0;
            int contador = 0;

            System.out.print("Números pares entre 100 y " + n + ": ");
            for (int i = 100; i >= n; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    suma += i;
                    contador++;
                }
            }

            double promedio = (double) suma / contador;
            System.out.println("\nLa suma: " + suma);
            System.out.println("El promedio: " + promedio);

            System.out.print("¿Deseas continuar (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}