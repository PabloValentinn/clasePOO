// p28_LeyDeNewton - Calula la 2da ley de newton

import java.util.Scanner;

public class p28_LeyDeNewton {
    public static void main(String[] args) {
        float f, m ,a ;
        char op;
        Scanner obj = new Scanner(System.in);


        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Elige lo que deseas calcular");
        System.out.println("[F]uerza (f = m *a)");
        System.out.println("[M]asa (m = f / a)");
        System.out.println("[A]celeracion (a = f / m)");
        System.out.println("[S]alir del sistema ");
        System.out.println("Elige una opcion "); op = obj.next().charAt(0);
        op = Character.toUpperCase(op);
        f = m =a =0;

        if (op == 'F') {
            System.out.println("Calculando la fuerza ");  
            System.out.println("Dame la fuerza: "); m = obj.nextFloat();
            System.out.println("Dame la aceleacion "); a = obj.nextFloat();  
            f = m *a;
            System.out.printf("La fuerza es %.2f\n", f);
            
        } else if(op == 'M'){
            System.out.println("Calculando la masa ");  
            System.out.println("Dame la fuerza: "); f = obj.nextFloat();
            System.out.println("Dame la aceleacion "); a = obj.nextFloat();  
            m = f / a;
            System.out.printf("La masa es %.2f\n", f);
        } else if(op == 'A'){
            System.out.println("Calculando la aceleracion ");  
            System.out.println("Dame la fuerza: "); f = obj.nextFloat();
            System.out.println("Dame la aceleacion "); a = obj.nextFloat();  
            a = f / m;
            System.out.printf("La aceleracion es %.2f\n", f);
        } else if(op == 'S'){
            System.out.println("Momento de salir ");
        } else System.out.println("Opcion invalida ");

        System.out.println("BYEEEEEEEEEEEEEEE");

    
    }

}
