// lee y muestra las propiedades de un archivo

import java.io.File;

public class p132_Archivos1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        File arch = new File("Datos.txt");
        System.out.println("Nombre de archivo: " + arch.getName());
        System.out.println("Es directorio: " + arch.isDirectory());
        System.out.println("Es un archivo: " + arch.isFile());
        System.out.println("Ruta relativa: " + arch.getPath());
        System.out.println("Ruta absoluta: " + arch.getAbsolutePath());

        if (arch.exists()) {
            System.out.println("El archivo existe en la ruta actual");
        } else
            System.out.println("El archivo no existe");
            System.out.println("Se puede leer? " + arch.canRead());
            System.out.println("Se puede escribir? " + arch.canWrite());
            System.out.println("Longitud del archivo " + arch.length());
            System.out.println("Fecha de modificacion " + arch.lastModified());
        
    }
    
}
