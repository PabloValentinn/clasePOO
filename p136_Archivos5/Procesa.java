package p136_Archivos5;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Procesa {
    public static void capturarDatos(ArrayList<Persona> datos) {
        Scanner obj = new Scanner(System.in);
        System.out.println("\nIntroduce los datos de una persona (nombre vacio para terminar)");
        while (true) {
            Persona persona = new Persona();
            System.out.println("Datos de la persona> ");
            System.out.print("Nombre: "); persona.setNombre(obj.nextLine());
            if(persona.getNombre().isEmpty()) break;            
            System.out.print("Edad: "); persona.setEdad(obj.nextInt());
            System.out.print("Peso: "); persona.setPeso(obj.nextFloat()); obj.nextLine();
            System.out.print("Correo: "); persona.setCorreo(obj.nextLine());
            datos.add(persona);
        }
    }

    public static void mostrarDatos(ArrayList<Persona> datos){
        System.out.println("\nLos datos hasta el momento son: ");
        for (Persona persona : datos) {
            System.out.println(persona);
            
        }
    }

    public static void grabarDatos(String archivo, ArrayList<Persona> datos) throws  IOException{
        ObjectOutputStream fdatos = new ObjectOutputStream (new FileOutputStream(archivo));
        for (Persona persona : datos)
        fdatos.writeObject(persona);
        fdatos.close();
    }

     public static ArrayList<Persona> leerDatos(String archivo) throws IOException, ClassNotFoundException{
        ArrayList<Persona> datos = new ArrayList<>();
        ObjectInputStream fdatos = new ObjectInputStream(new FileInputStream(archivo));
        datos = (ArrayList<Persona>) fdatos.readObject();
        fdatos.close();
            return datos;
    }
    
}
