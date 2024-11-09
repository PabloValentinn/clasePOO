import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p144_Temperaturas extends JFrame implements ActionListener {

    JPanel p1;
    JLabel lblGrados;
    JTextField txtGrados;
    ButtonGroup grpOpciones;
    JRadioButton rbtCelsius, rbtFarenheit;
    JButton btnCalcular, btnSalir;

    public p144_Temperaturas() {
        super("Conversión de Temperaturas");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblGrados = new JLabel("Temperatura: ", JLabel.RIGHT); 
        p1.add(lblGrados);

        txtGrados = new JTextField(); 
        p1.add(txtGrados);

        grpOpciones = new ButtonGroup();
        rbtCelsius = new JRadioButton("Celsius");
        rbtFarenheit = new JRadioButton("Fahrenheit");
        grpOpciones.add(rbtCelsius); 
        grpOpciones.add(rbtFarenheit);

        p1.add(rbtCelsius); 
        p1.add(rbtFarenheit);

        add(p1);

        btnCalcular = new JButton("Calcular"); 
        add(btnCalcular);

        btnSalir = new JButton("Salir"); 
        add(btnSalir);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        float temp, res;

        if (e.getSource() == btnCalcular) {
            try {
                if (rbtCelsius.isSelected()) {
                    temp = Float.parseFloat(txtGrados.getText());
                    res = (temp - 32) * 5 / 9;
                    txtGrados.setText(String.format("Resultado: %.2f °C", res));

                } else if (rbtFarenheit.isSelected()) {
                    temp = Float.parseFloat(txtGrados.getText());
                    res = (temp * 9 / 5) + 32;
                    txtGrados.setText(String.format("Resultado: %.2f °F", res));
                } else {
                    JOptionPane.showMessageDialog(this, "Seleccione una opción para la conversión.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
