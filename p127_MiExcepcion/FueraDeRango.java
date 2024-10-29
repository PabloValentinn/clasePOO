package p127_MiExcepcion;

// Para crear nuestra propia excepcion
// creamos un constructor que pase el mensade de error a la clase base
public class FueraDeRango extends Exception {
    public FueraDeRango(String error){
        super(error);
    }
    
}
