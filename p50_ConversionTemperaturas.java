// p50_ConversionTemperaturas - calcular la temperatura convertida de grados centígrados a grados farenheit
import java.util.Scanner;

public class p50_ConversionTemperaturas {
    public static void main(String[] args) {
        float ini, fin, c;
        float tc;
        char resp;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Tabla de conversion de Centigrados a Farenheit");
        do {       
            do {
            System.out.print("Dame inicio   :   "); ini = obj.nextInt();
            System.out.print("Dame fin      :   "); fin = obj.nextInt();
        } while (fin < ini);

        c = ini;
        tc = (c * 9f / 5f) + 32;
        System.out.println("Centigrados \t\t Farenheit ");
        System.out.println("============================================");
        while (c <= fin) {
            System.out.printf("%.2f  =  %.2f \n", c, tc);
            c++;
            tc+=1.8;
        }
        System.out.println("============================================");
        System.out.print("Deseas continuar (S/N)?");
        resp = Character.toUpperCase(obj.next().charAt(0));

        } while (resp != 'N');
    }
    
}
   

