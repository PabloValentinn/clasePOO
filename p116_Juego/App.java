package p116_Juego;

public class App {
    public static void main(String[] args) {
        
        JuegoDados miDados = new JuegoDados();

        System.out.print("\033[H\033[2J");
        miDados.iniciar();
        miDados.jugar();
        miDados.finalizar();

        JuegoAdivina miaAdivina = new JuegoAdivina();
        miaAdivina.iniciar();
        miaAdivina.jugar();
        miaAdivina.finalizar();


    }
    
}
