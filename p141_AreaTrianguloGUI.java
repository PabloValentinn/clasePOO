import javax.swing.*;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;

public class p141_AreaTrianguloGUI extends JFrame implements ActionListener{
    private JLabel lblBase, lblAltura, lblResultado;
    private JTextField txtBase, txtAltura;
    private JButton btnCalcular, btnSalir;

    public p141_AreaTrianguloGUI(){
        super("Calcular el area de un triangulo");
        setLayout(null);

        lblBase = new JLabel("Base");
        lblBase.setBounds(10,20,200,30);
        add(lblBase);

        txtBase = new JTextField();
        txtBase.setBounds(80, 20, 200,30);
        add(txtBase);
        
        
        lblAltura = new JLabel("Altura");
        lblAltura.setBounds(10,50,200,30);
        add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(80, 50, 200,30);
        add(txtAltura);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30,110, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150,110, 100, 40);
        add(btnSalir);

        lblResultado = new JLabel("[Aqui va el resultado]");
        lblResultado.setBounds(90, 80, 200, 30);
        add(lblResultado);
        btnSalir.addActionListener(this);
        btnCalcular.addActionListener(this);

    }

    public float getArea(float base, float altura){
        return(base * altura) /2;
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Te vas porque quieres", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource()==btnCalcular) {
            float base = Float.parseFloat(txtBase.getText());
            float altura = Float.parseFloat(txtAltura.getText());
            float area = getArea(base, altura);
            lblResultado.setText(String.format("%.2f", area));
            
        }
            
        
    }

    public static void main(String[] args) {
        p141_AreaTrianguloGUI app = new  p141_AreaTrianguloGUI();
        app.setBounds(0,0,300,200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
