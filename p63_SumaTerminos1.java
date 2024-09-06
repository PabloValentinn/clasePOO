// p63_SumaTerminos1 - imprimir la secuencia de términos armónicos el número de renglones 
//que el usuario desee y su suma

import java.util.Scanner;

public class p63_SumaTerminos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos? ");
        int terminos = scanner.nextInt();
        
       
        double suma = 0;
        StringBuilder secuencia = new StringBuilder();
        
       
        for (int i = 1; i <= terminos; i++) {
            if (i > 1) {
                secuencia.append("+");
            }
            if (i == 1) {
                secuencia.append("1");
            } else {
                secuencia.append("1/").append(i);
            }
            suma += 1.0 / i;
        }
        
       
        System.out.println("Salida: " + secuencia.toString());
        
        
        System.out.printf("Suma: %.3f\n", suma);
        
    } 
    
}
