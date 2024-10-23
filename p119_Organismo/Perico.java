package p119_Organismo;

public class Perico extends Organismo implements Ave {

    public Perico(String nombre){
        super(nombre);
    }

    @Override
    public void dosPatas() {
        System.out.println("Es una ave que camina en dos patas > es un perico ");
        
    }

    @Override
    public void volar() {
        System.out.println("Es una ave que vuela > es un perico");
        
    }

    @Override
    public void multiCelular() {
        System.out.println("Es un animal multicelular > es un perico");
        
    }

    @Override
    public void sangreCaliente() {
        System.out.println("Es un animal de sangre caliente > es un perico");
        
    }

    
}
