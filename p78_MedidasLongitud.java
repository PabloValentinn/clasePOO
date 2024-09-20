// p78_MedidasLongitud - Diseña un programa con dos funciones una que 
//convierta pulgadas a centímetros y otra que convierta de metros a
//pies. Deberá́ mostrar un menú́ con las opciones correspondientes.

import java.util.Scanner;

public class p78_MedidasLongitud {
    public static float PaC(float pulgadas){
        return( pulgadas = pulgadas * 2.54f);
    }
    public static float MaP(float metros){
        return( metros = metros * 3.28f);
    }

    public static void main(String[] args) {
        int op;
        Float pulgadas, metros;
        Scanner obj = new Scanner(System.in);

        do{
        System.out.print("\033[H\033[2J");

        System.out.println("Conversion de Longitudes");
        System.out.println("1. C a F\n2. F a C\n3. Salir");
        System.out.print("Elige? "); op = obj.nextInt();

        switch (op) {
            case 1:
            System.out.println("Convertir de P a C");
            System.out.print("Dame las pulgadas "); pulgadas = obj.nextFloat();
            System.out.print("El resultado es: "+ PaC(pulgadas)); 

            break;
            case 2:
            System.out.println("Convertir de M a P");
            System.out.print("Dame los metros: "); metros = obj.nextFloat();
            System.out.print("El resultado es: "+ MaP(metros)); 

            break;
            case 3:
            System.out.println("\nGracias por utilizar este programa"); break;
        
            default:
                break;
        }

            System.out.println("\n<Presiona cualquier tecla para continuar>");obj.nextLine();obj.nextLine();
        } while (op!=3);
        System.out.println("\nPrograma terminado");
    obj.close();
    }
    
    
}
