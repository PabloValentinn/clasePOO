package p113_SegundoExamenParcial;

import java.util.ArrayList;

import p112_ControlVentas.Venta;

public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> Jugador;
    public Equipo() {
    }
    public Equipo(String nombre, String liga) {
        Jugador = new ArrayList<>();
        Nombre = nombre;
        Liga = liga;
    }
    public ArrayList<Jugador> getJugador() {
        return Jugador;
    }

    public void agregarJugador(Jugador jugador){
        Jugador.add(jugador);
    }

    public double getBono(){
        double Bono =0;
        for (Jugador jugador : Jugador) {
            Bono = Bono + jugador.getBono();
        }
        return Bono;
    }

    public double getTotal(){
        double Total = 0;
        for (Jugador jugador : Jugador) {
            Total = Total + jugador.Total;
        }
        return Total;
    }

    public int getTotalH(){
        int TotalH = 0;
        for (Jugador jugador2 : Jugador) {
            if (jugador2.Sexo == 'H') {
                TotalH++;
                
            }
        }

        return TotalH;

    }

    public int getTotalM(){
        int TotalM = 0;
        for (Jugador jugador2 : Jugador) {
            if (jugador2.Sexo == 'M') {
                TotalM++;
                
            }
        }

        return TotalM;

    }

    public void reporte(){
        System.out.println(this);
        for (Jugador jugador : Jugador){
            System.out.println("> " + jugador);
        }

        System.out.println("\n");
    }
    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", Jugador=" + Jugador + "]";
    }
     
    

    

    
}
