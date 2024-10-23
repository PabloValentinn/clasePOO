package p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego {
    private int dado1, dado2;
    private String jugador1, jugador2;
    private Scanner obj = new Scanner(System.in);

    @Override
    public void iniciar() {
        System.out.print("Jugador 1 = "); jugador1 = obj.nextLine();
        System.out.print("Jugador 2 = "); jugador2 = obj.nextLine();
        
    }
    @Override
    public void jugar() {
        dado1 = 1 + (int) (Math.random()*6);
        dado1 = 2 + (int) (Math.random()*6);
        
        System.out.println(jugador1 + " le salio el valor de " + dado1);
        System.out.println(jugador2 + " le salio el valor de " + dado2);
    }
    @Override
    public void finalizar() {
        if (dado1 > dado2) {
            System.out.println("Ganno " + jugador1 + " con un valor de "+ dado1);
        }
        else if (dado2 > dado1)
        System.out.println("Gano " + jugador2+ " con un valor de " + dado2);
        else 
        System.out.println("Los jugadores empataron, con un valor de " +dado1);
        
    }
    
    


    
}
