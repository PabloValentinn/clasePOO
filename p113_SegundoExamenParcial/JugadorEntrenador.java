package p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int Subordinados;
    private int Proyectos;

    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario,
            int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        Subordinados = subordinados;
        Proyectos = proyectos;
        Total = Salario + getBono();
    }

    public double getBono() {
        double Bono=0;
        Bono=(Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
        return Bono;
    }

    @Override
    public String toString() {
        return "JugadorEntrenador [Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + ", Total=" + Total
                + ", getBono()=" + getBono() + "]";
    }

   
    

   

    

    

    
}
