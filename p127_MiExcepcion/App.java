package p127_MiExcepcion;

public class App {
        
        public static int sumar(int a, int b) throws FueraDeRango {
            if (a>b || b>100) throw new FueraDeRango("Valores fuera de rango");
            return a+b;
        }
        public static void main(String[] args) {
            System.out.print("\033[H\033[2J");

            
            try {
                System.out.println("La suma es: " + sumar(100, 200));
                
            } catch (FueraDeRango e) {
                System.out.println(e.getMessage());
            }
    }
    
}
