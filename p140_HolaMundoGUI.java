import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGUI extends JFrame {

    private JLabel lblSaludo;
    public p140_HolaMundoGUI(){
        setLayout(null);
        lblSaludo = new JLabel("Hola mundo");
        lblSaludo.setFont(new Font("Arial", Font.BOLD+ Font.ITALIC ,30));
        lblSaludo.setBounds(50,70,200,30);
        add(lblSaludo);
        setTitle("Mi primer programa bla bla bla");
    }
    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(10, 10, 800, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
}
