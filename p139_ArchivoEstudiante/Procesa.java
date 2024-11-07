package p139_ArchivoEstudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Procesa {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void capturaDatos() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese el sexo del estudiante (M/F): ");
        String sexo = scanner.nextLine().toUpperCase();

        Estudiante estudiante = new Estudiante(nombre, edad, promedio, sexo);
        estudiantes.add(estudiante);
        System.out.println("Estudiante registrado exitosamente.");
    }

    public void grabarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            oos.writeObject(estudiantes);
            System.out.println("Datos grabados en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al grabar los datos: " + e.getMessage());
        }
    }

    public void leerDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("estudiantes.dat"))) {
            estudiantes = (ArrayList<Estudiante>) ois.readObject();
            System.out.println("Datos cargados desde el archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer los datos: " + e.getMessage());
        }
    }

    public void mostrarDatos() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }

    public void calcularPromedioCalificaciones() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        double totalPromedio = 0;
        for (Estudiante estudiante : estudiantes) {
            totalPromedio += estudiante.getPromedio();
        }
        double promedioGeneral = totalPromedio / estudiantes.size();
        System.out.println("Promedio general de calificaciones: " + promedioGeneral);
    }

    public void calcularPromedioEdades() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        double totalEdad = 0;
        for (Estudiante estudiante : estudiantes) {
            totalEdad += estudiante.getEdad();
        }
        double promedioEdad = totalEdad / estudiantes.size();
        System.out.println("Promedio general de edades: " + promedioEdad);
    }
    public void contarHombres() {
        int cantidadHombres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo().equals("M")) {
                cantidadHombres++;
            }
        }
        System.out.println("Cantidad de hombres: " + cantidadHombres);
    }

    public void contarMujeres() {
        int cantidadMujeres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getSexo().equals("F")) {
                cantidadMujeres++;
            }
        }
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Capturar datos de un estudiante");
            System.out.println("2. Grabar datos en archivo");
            System.out.println("3. Leer datos desde archivo");
            System.out.println("4. Mostrar datos de estudiantes");
            System.out.println("5. Calcular promedio de calificaciones");
            System.out.println("6. Calcular promedio de edades");
            System.out.println("7. Contar cantidad de hombres");
            System.out.println("8. Contar cantidad de mujeres");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    capturaDatos();
                    break;
                case 2:
                    grabarDatos();
                    break;
                case 3:
                    leerDatos();
                    break;
                case 4:
                    mostrarDatos();
                    break;
                case 5:
                    calcularPromedioCalificaciones();
                    break;
                case 6:
                    calcularPromedioEdades();
                    break;
                case 7:
                    contarHombres();
                    break;
                case 8:
                    contarMujeres();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
