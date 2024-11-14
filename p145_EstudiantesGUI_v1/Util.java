package p145_EstudiantesGUI_v1;

import java.util.ArrayList;
import java.io.*;

public class Util {
    public static ArrayList<Estudiante> inicializarDatos() {
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Juan Perez", 22, 34.5, "peezitogmail.com"));
        datos.add(new Estudiante("Maria Perez", 16, 22.5, "peezitaaagmail.com"));
        datos.add(new Estudiante("Carlos funtes", 44, 56.5, "peezitaaagmail.com"));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Estudiante> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Estudiante> desSerializarDatos(String archivo) throws IOException,
            ClassNotFoundException {
        ArrayList<Estudiante> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Estudiante>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

}
