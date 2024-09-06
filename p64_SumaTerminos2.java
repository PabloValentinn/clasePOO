// p64_SumaTerminos2 - imprimir la secuencia de términos, el número de 
// renglones que el usuario desee y su suma

import java.util.Scanner;

public class p64_SumaTerminos2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.print("¿Cuántos términos? ");
        int numTerms = scanner.nextInt();

        
        int suma = 0;
        StringBuilder secuencia = new StringBuilder();

       
        for (int i = 1; i <= numTerms; i++) {
            
            StringBuilder termino = new StringBuilder();
            for (int j = 0; j < i; j++) {
                termino.append("1");
            }

            int numeroTermino = Integer.parseInt(termino.toString());
            suma += numeroTermino;

            if (i > 1) {
                secuencia.append("+");
            }
            secuencia.append(termino.toString());
        }

        System.out.println(secuencia.toString());
        System.out.println("suma " + suma);
    }
}

    


