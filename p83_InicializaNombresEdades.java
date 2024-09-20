// p83_InicializaNombresEdades - INicializa al declarar dos arreglos

public class p83_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Mateo", "Maria"};
        int[] edades = {22, 25, 44, 38, 50, 16};


        System.out.print("\033[H\033[2J");

        System.out.println("Longitud de nombres : "+ nombres.length);
        System.out.println("Longitud de edades : "+ edades.length);

        System.out.println("\nLos nombres: ");
        for(String nombre : nombres) System.out.println(nombre + " ");

        System.out.println("\nLas edades: ");
        for(int edad : edades) System.out.println(edad + " ");

        System.out.println("Cada nombre con su edad");
        for(int i=1; i<nombres.length; i++)
            System.out.println(nombres[i] + " - " + edades[i]);
    }
    
}
