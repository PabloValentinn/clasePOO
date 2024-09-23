// p89_ArregloAleatorios - Genera dos arreglos de números aleatorios y los suma en un tercer arreglo
import java.util.Random;
import java.util.Scanner;

public class p89_ArregloAleatorios {

    public static void Mostrar(float[] x){
        for(int i=0; i<x.length; i++)
        System.out.printf("%.2f ",x[i]);
        System.out.println();
    }

    public static void GenialAleatorio(float[] x){
        float min=1.5f, max = 10.5f;
        for(int i=0; i<x.length; i++)
            x[i] = new Random().nextFloat(max - min)+min;
       
    }

    public static void SumaArreglos(float[] x, float[] y, float[] z){
        for(int i=0; i<x.length; i++)
            z[i] = x[i] + y[i];
       
    }
    public static void main(String[] args) {
        int MAX = 15;
        float[] f1 = new float[MAX];
        float[] f2 = new float[MAX];
        float[] f3 = new float[MAX];

        System.out.print("\033[H\033[2J");
        Mostrar(f1);
        GenialAleatorio(f1);
        GenialAleatorio(f2);
        System.out.println("Arreglo de numeros aleatorios");
        Mostrar(f1);
        Mostrar(f2);
        SumaArreglos(f1, f2, f3);
        System.out.println("La suma es ");
        Mostrar(f3);
    }
    
}
