// p51_SerieFibonaci - Se desean imprimir los primeros n números de la será de Fibonacci.
import java.util.Scanner;

public class p51_SerieFibonaci {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        Scanner leer = new Scanner(System.in);
        int f = 0;
        int t1 = 1;
        int t2;
        char resp;

        
        do {
        System.out.print("¿Número de términos que deseas imprimir ?: "); 
        int n = leer.nextInt();
       

        for (int i=1; i<=n; i++){

            t2 = f;
            f = t1 + f;
            t1 = t2;

            System.out.println("Los primeros " + n + " términos de la sucesión Fibonacci son:" +t1);
        }

        System.out.print("Deseas continuar (S/N)? ");
        resp = Character.toUpperCase(leer.next().charAt(0));

     } while (resp != 'N');
     System.out.println("\nProceso terminado");
        
    }
    
}
