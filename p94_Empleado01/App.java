package p94_Empleado01;

// Programa principal

public class App {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(); // instanciar
        Empleado empleado2 = new Empleado(); // instanciar

        empleado1.Nombre = "Juan perez";
        empleado1.Edad = 45;     
        empleado2.Nombre = "Maria perez";
        empleado2.Edad = 25;     

        Empleado empleado3;
        empleado3 = new Empleado(); // instanciar
        empleado3.Nombre = "Jorge";
        empleado3.Edad = 15;
        
        System.out.print("\033[H\033[2J");
        System.out.println("Empleado 1 nombre: " + empleado1.Nombre);
        System.out.println("Empleado 1 edad: " + empleado1.Edad);
        System.out.println("Empleado 2 nombre: " + empleado2.Nombre);
        System.out.println("Empleado 2 edad: " + empleado2.Edad);

        System.out.println(empleado2.toString());

        System.out.println(empleado3.toString());

    }

}