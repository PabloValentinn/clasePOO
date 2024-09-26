package p97_Empleado04;

import java.util.ArrayList;
public class App {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        int h=0, m=0, c=0, s=0;
        Empleado empleado1 = new Empleado("Juan perez", 35, 'H', true);
        Empleado empleado2 = new Empleado("Maria lopez", 22, 'M', false);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(new Empleado("Darios Jimenez", 33, 'H', false));
        empleados.add(new Empleado("Jezzica Eszz", 31, 'M', false));

        System.out.print("\033[H\033[2J");
        System.out.println("Todos los empleados");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());

            if (empleado.getSexo()=='H') h++;
            else if (empleado.getSexo()=='M') m++;

            if (empleado.isCasado()) c++; else s++;
            
        }

        System.out.println("Hombres: "+ h);
        System.out.println("Mujeres: "+ m);
        System.out.println("Solteros: "+ s);
        System.out.println("Casados: "+ c);
    }
    
}
