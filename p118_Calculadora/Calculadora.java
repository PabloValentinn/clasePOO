package p118_Calculadora;

public class Calculadora implements Calcular {

    @Override
    public void mostrarResultado(double resultado) {
        System.out.printf("%,.2f\n", resultado);
        
    }

    @Override
    public void restar(double x, double y) {
        double res= x-y;
        mostrarResultado(res);
        
    }
    
    @Override
    public void sumar(double x, double y) {
        double res= x+y;
        mostrarResultado(res);
        
        
    }
    
    @Override
    public void dividir(double x, double y) {
        double res= x/y;
        mostrarResultado(res);
        
    }
    
    @Override
    public void multiplicar(double x, double y) {
        double res= x*y;
        mostrarResultado(res);
        
    }

    
    
}
