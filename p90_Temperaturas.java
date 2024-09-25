// p90_Temperaturas - Declare un arreglo de números flotantes llamado temperaturas y que lo inicialice los siguientes elementos:
// 2.34 44.56 7.89 0.5 2.5 4.67 40.3 22.35 56.22

public class p90_Temperaturas {
    public static void Mostrar(double[] x){
        for(int i=0; i<x.length; i++)
        System.out.println(x[i] + " ");
        System.out.println();
    }

    public static int Buscar(double[] x, double bus){
        int pos=-0;
        for(int i=1; i <x.length; i++)
        if(x[i]==bus){
            pos = i;
            break;
        }
    return pos;

    }
    public static void main(String[] args) {
        double[] temps = {2.34, 44.56, 7.89, 0.5, 2.5, 4.67, 40.3, 22.35, 56.22};
        System.out.print("\033[H\033[2J");
        System.out.println(" Todos los elementos del arreglo de temperaturas:");
        Mostrar(temps);
        
        System.out.println("Primer elemento del arreglo: ");
        System.out.println(temps[0]);
        System.out.println("Tercer elemento del arreglo: ");
        System.out.println(temps[2]);

        System.out.println("A todos los elementos mayores a 10 se les pone 0");

        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 10) {
                temps[i] = 0;
            }
        }

        for (double num : temps)
            System.out.print(num + " ");

        
    }
    
}
