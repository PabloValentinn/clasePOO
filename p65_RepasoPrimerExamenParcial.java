/* Una empresa fotocopiadora requiere un programa que le permita llevar el control de su venta de
fotocopias. El valor de la copia es: Carta $3, Oficio $4, Doble Oficio $6, debe mostrarse un
resumen de ventas con un mensaje de acuerdo a la venta total */

// Pablo Valentin Varela Rivera 

import java.util.Scanner;

public class p65_RepasoPrimerExamenParcial {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();

        int venta=1, cantidad=0, carta=0, oficio=0, doble=0, cantidadCarta=0, cantidadOficio=0, cantidadDoble=0;
        int totalVenta, totalArticulos;
        char TipoCopia, resp;
        Scanner obj = new Scanner(System.in);

        
        System.out.println("=======================================");
        System.out.println("Papelería la Malena, SA. de CV.\r\n" + 
        "Sistema de ventas de copias");
        System.out.println("=======================================");


        do {
        System.out.println("\nVenta: " + venta++);
        System.out.print("Tipo de copia:\n(C)arta $3\n(O)ficio $4\n(D)oble Of $6: "); 
        TipoCopia = Character.toUpperCase(obj.next().charAt(0));

        System.out.print("Cantidad: "); cantidad = obj.nextInt();

        System.out.print("Otra venta (S/N)? ");
        resp = Character.toUpperCase(obj.next().charAt(0));

        switch (TipoCopia) {
            case 'C': cantidadCarta = cantidad ;  
            carta = cantidadCarta *3;
            break;
            
            case 'O': cantidadOficio = cantidad;  
            oficio = cantidadOficio *4;
            break;

            case 'D': cantidadDoble = cantidad;  
            doble = cantidadDoble *6;
            default: 
                break;
        }

        } while (resp != 'N');

        System.out.println("\n======================================");
        System.out.println("Resumen diario de ventas");
        System.out.println("======================================");

        System.out.println("\nVentas realizadas: "+ (venta-1));

        System.out.println("===================================");
        System.out.println("Carta: "+ cantidadCarta + " - $ " + carta);
        System.out.println("Oficio: "+ cantidadOficio + " - $ " + oficio);
        System.out.println("Doble of.: "+ cantidadDoble + " - $ " + doble);
        System.out.println("===================================");

        totalVenta = carta + oficio + doble;
        totalArticulos = cantidadCarta + cantidadDoble + cantidadOficio;

        
        if (totalVenta < 50) {
            System.out.println("Total ventas: " + totalArticulos + " - $ " + totalVenta);
            System.out.println("\nEsta venta es una: Venta Moderada ");}
        
        else
            if (totalVenta >= 50 && totalVenta <=100) {
                System.out.println("Total ventas: \n" + totalArticulos + " - $ " + totalVenta);
                System.out.println("\nEsta venta es una: Venta Frecuente "); }
            else { 
            System.out.println("Total ventas: \n" + totalArticulos + " - $ " + totalVenta);
            System.out.println("\nEsta venta es una: Venta Superada "); }

        obj.close();
            
        
    }
    
}
