// p36_CompraPizza

import java.util.Scanner;

public class p36_CompraPizza {
    public static void main(String[] args) {
        int tamanoCompra;
        double totalCompra, descuento, totalDescuento, chica, mediana, grande;
        Scanner obj = new Scanner(System.in);
        char op;

        totalCompra = 0;
       

        System.out.print("\033[H\033[2J"); System.out.flush();

        System.out.println("\nElige el tamaño de la pizza");
        System.out.println("[C]hica - $5");
        System.out.println("[M]ediana - $10");
        System.out.println("[G]rande - $20");
        System.out.println("Elige una opcion "); 
        op = Character.toUpperCase(obj.next().charAt(0));


        System.out.println("Dame la cantidad que vas a comprar");
        tamanoCompra = obj.nextInt();

        switch (op) {
            case 'C': totalCompra = tamanoCompra *5;
            if (totalCompra > 2000) {
                descuento = (totalCompra /100) * 15 ;
                totalDescuento = totalCompra - descuento;
                System.out.println("El total con el descuento es "+ totalDescuento + " ,el descuento fue de "+ 
                descuento+ " la cantidad comprada fue de "+ tamanoCompra+" y el total sin el descuento era de "+ totalCompra);
                
            }
            else
                System.out.println("el total es: "+totalCompra+ " , no tiene descuento");
            break;
            case 'M': totalCompra = tamanoCompra *10;
            if (totalCompra > 2000) {
                descuento = (totalCompra /100) * 15 ;
                totalDescuento = totalCompra - descuento;
                System.out.println("El total con el descuento es "+ totalDescuento + " ,el descuento fue de "+ 
                descuento+ " la cantidad comprada fue de "+ tamanoCompra+" y el total sin el descuento era de "+ totalCompra);
                
            }
            else
                System.out.println("el total es: "+totalCompra+ " , no tiene descuento");
            break;
            case 'G': totalCompra = tamanoCompra *20;
            if (totalCompra > 2000) {
                descuento = (totalCompra /100) * 15 ;
                totalDescuento = totalCompra - descuento;
                System.out.println("El total con el descuento es "+ totalDescuento + " ,el descuento fue de "+ 
                descuento+ " la cantidad comprada fue de "+ tamanoCompra+" y el total sin el descuento era de "+ totalCompra);
                
            }
            else
                System.out.println("el total es: "+totalCompra+ " , no tiene descuento");
            break;
            
            default:
            System.out.println("Errorr 401");
                break;
        }



        
    }
    
}
