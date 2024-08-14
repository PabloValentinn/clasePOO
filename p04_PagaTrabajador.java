// p04_PagaTrabajador - Calcula la paga de un trabajador

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagaBruta, pagaNeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("\nCalculando la paga de un trabajador\n");
        //entrada
        System.out.print("Nombre del trabajador: "); nombre=obj.nextLine();
        System.out.println("Horas trabajadas: "); horas= obj.nextInt();
        System.out.println("Paga por hora: "); paga = obj.nextFloat();
        tasa = 0.03;
        //Proceesoooooooo
        pagaBruta = horas*paga;
        impuesto = pagaBruta * tasa;
        pagaNeta = pagaBruta - impuesto;
        System.out.println(String.format("El trabajador %s trabajo %d horas con una paga de %f pesos y una tasa de %f", nombre,horas,paga,tasa));
        System.out.println(String.format("Paga bruta: %.2f", pagaBruta));
        System.out.println(String.format("Impuesto: %.2f", impuesto));
        System.out.println(String.format(" Paga Neta: %.2f", pagaNeta));
    }
    
}
