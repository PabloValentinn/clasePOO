package p147_TercerExamenParcial;

import java.util.ArrayList;
import java.io.*;

public class Util {
    public static ArrayList<Jugador> inicializarDatos() {
        ArrayList<Jugador> datos = new ArrayList<>();
        datos.add(new Jugador("Llionel Messi", 33, 'H', " Casado", "Uno de los mejores jugadores del mundo", 333.432));
        datos.add(new Jugador("Cristiano Ronaldo", 38, 'H', " Casado", "Uno de los mejores jugadores del mundo", 423.221));
        datos.add(new Jugador("Neymar Junior", 35, 'H', " Soltero", "Uno de los mejores regateadores del mundo", 879.221));
        return datos;
    }

    public static void serializarDatos(String archivo, ArrayList<Jugador> datos) throws IOException {
        FileOutputStream arch = new FileOutputStream(archivo);
        ObjectOutputStream fpersonas = new ObjectOutputStream(arch);
        fpersonas.writeObject(datos);
        fpersonas.close();
    }

    public static ArrayList<Jugador> desSerializarDatos(String archivo) throws IOException,
            ClassNotFoundException {
        ArrayList<Jugador> datos;
        FileInputStream arch = new FileInputStream(archivo);
        ObjectInputStream fpersonas = new ObjectInputStream(arch);
        datos = (ArrayList<Jugador>) fpersonas.readObject();
        fpersonas.close();
        return datos;
    }

}
