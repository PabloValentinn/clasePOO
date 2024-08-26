// p29_Calculadora - Realiza operaciones matematicas basicas sobre dos numeros

import java.util.Scanner;

public class p29_Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        char op;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\nEfectuando operaciones matematicas basicas sobre dos numeros");
        System.out.println("Dame numero 1 ");
        n1 = obj.nextFloat();
        System.out.println("Dame numero 2 ");
        n2 = obj.nextFloat();
        System.out.println("Operacion + - * / ^  ");
        op = obj.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("%.2f + %,2f = %.2f", n1, n2, n1 + n2);
                break;
            case '-':
                System.out.printf("%.2f - %,2f = %.2f", n1, n2, n1 - n2);
                break;
            case '*':
                System.out.printf("%.2f * %,2f = %.2f", n1, n2, n1 * n2);
                break;
            case '/':
                System.out.printf("%.2f / %,2f = %.2f", n1, n2, n1 / n2);
                break;
            case '^':
                System.out.printf("%.2f ^ %,2f = %.2f", n1, n2, Math.pow(n1, n2));
                break;

            default:
                System.out.println("\nEsa operacion no esta implementada\n");
                break;
        }

    }

}
