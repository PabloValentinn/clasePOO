package p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Compacto comp1 = new Compacto("CP0100010122", "Ford", 2023,125345.23, 4,2);
        Compacto comp2 = new Compacto("CP1000145555", "Nissan", 2010,54500.33, 6,4);

        Camioneta cami1 = new Camioneta("CA104014544", "Dina", 2008,234567.15, 450.0, 4);
        Camioneta cami2 = new Camioneta("CA774814599", "Hongyan", 2023,934577.98, 1200.0, 6);
      
        
        System.out.print("\033[H\033[2J");
        System.out.println("========================================");
        System.out.println("Datos de los vehiculos de la flota");
        System.out.println("========================================\n");
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(cami1);
        System.out.println(cami2);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Calculando el total de precio de todos los vehículos ...");
        System.out.println(comp1.getPrecio());
        System.out.println(comp2.getPrecio());
        System.out.println(cami1.getPrecio());
        System.out.println(cami2.getPrecio());
        System.out.println("-----------------------------------------------");
        
        System.out.println("La suma de precios es: " + (comp1.getPrecio() + comp2.getPrecio() + cami1.getPrecio() + cami2.getPrecio()));
        
    }
    
}
