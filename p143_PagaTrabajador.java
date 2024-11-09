import javax.swing.*;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;


public class p143_PagaTrabajador extends JFrame implements ActionListener{
    private JLabel lblHoras, lblPaga, lblTasa, lblResultado;
    private JTextField txtHoras, txtPaga, txtTasa;
    private JButton btnCalcular, btnSalir;

    public p143_PagaTrabajador() {
        super("Calcular el area de un la paga e impuesto del trabajador");
        setLayout(null);

        lblHoras = new JLabel("Horas Trabajadas:");
        lblHoras.setBounds(10,20,200,30);
        add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(120, 20, 200,30);
        add(txtHoras);
        
        lblPaga = new JLabel("Paga por hora:");
        lblPaga.setBounds(10,50,200,30);
        add(lblPaga);

        txtPaga = new JTextField();
        txtPaga.setBounds(120, 50, 200,30);
        add(txtPaga);

        lblTasa = new JLabel("Tasa de impuesto:");
        lblTasa.setBounds(10,80,200,30);
        add(lblTasa);

        txtTasa = new JTextField();
        txtTasa.setBounds(120, 80, 200,30);
        add(txtTasa);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30,400, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150,400, 100, 40);
        add(btnSalir);

        lblResultado = new JLabel("[Resultado]");
        lblResultado.setBounds(90, 120, 400, 50);
        add(lblResultado);
        btnSalir.addActionListener(this);
        btnCalcular.addActionListener(this);
    }

    public float getPagaB(float horas, float paga){
        return horas * paga;
    }
    public float getIva(float pagabruta, float tasa){
        return pagabruta * tasa;
    }
    public float getPagaN(float pagabruta, float Iva){
        return pagabruta - Iva;
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Te vas porque quieres", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource()==btnCalcular) {
            float horas = Float.parseFloat(txtHoras.getText());
            float paga = Float.parseFloat(txtPaga.getText());
            float tasa = Float.parseFloat(txtTasa.getText());
            float Pagabruta = getPagaB(horas, paga);
            float Impuesto = getIva(getPagaB(horas, paga), tasa);
            float Paganeta = getPagaN(getPagaB(horas, paga), getIva(getPagaB(horas, paga), tasa));
            lblResultado.setText(String.format("Paga Bruta : %.2f   Impuesto: %.2f   Paga neta: %.2f", Pagabruta, Impuesto, Paganeta));
            
        }   
    }

    public static void main(String[] args) {
        p143_PagaTrabajador app = new p143_PagaTrabajador();
        app.setBounds(0, 0, 500, 500);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}