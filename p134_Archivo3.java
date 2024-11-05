// utiliza streams para leer datos de un archivo
import java.io.*;
import java.util.ArrayList;
public class p134_Archivo3 {
    public static void main(String[] args) {
        File arch = new File("ciudades.txt");
        ArrayList<String> ciudades = new ArrayList<String>();

        if (arch.exists()) {
            try {
                BufferedReader fciudades = new BufferedReader(new FileReader(arch));
                String linea;

                while( (linea = fciudades.readLine()) !=null) {
                    System.out.println(linea);
                    ciudades.add(linea);
                }
               fciudades.close();
               System.out.println("\nLas ciudades ya estan en el arreglo");
               for (String ciudad : ciudades){
                System.out.println(ciudad);
               }

            } catch (Exception e) {
               
            }
            
        }
        else System.out.println("No existe el archivo");
    }
}
