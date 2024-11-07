import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class p137_ArchivoMunicipios {
    public static void main(String[] args) {
        
        String[] nombres = {"Zacatecas", "Fresnillo", "Jerez", "Teul de GO", "Miguel Auza", "Tlatenango de SR", "Villanueva", "Apozl", "Cañitas de Felipe", "Santa Maria de la Guerra"};
        ArrayList<String> municipios = new ArrayList<String>();

        File arch = new File("municipios.txt");

        System.out.print("\033[H\033[2J");

        if(arch.exists()) 
            try{
                BufferedReader fmunicipios = new BufferedReader(new FileReader(arch));
                String linea;

                while( (linea = fmunicipios.readLine()) !=null){
                    System.out.println(linea);
                    municipios.add(linea);
                }
                fmunicipios.close();
                System.out.println("\nLas ciudades ya estan en el arreglo");
                for (String municipio : municipios){
                    System.out.println(municipio);
                }
            } catch (Exception e) {

            }
            else{
            try{
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : nombres)
                    fnombres.write(nombre + "\n");
                System.out.println("Los datos fueron escritos correctamente...");
                fnombres.close();
            } catch (Exception e){
                System.out.println("Problemas al procesar el archivo...");
                System.out.println(e);
            }
            }
            System.out.println("Longitud final del archivo escrito "+ arch.length());
        }
}