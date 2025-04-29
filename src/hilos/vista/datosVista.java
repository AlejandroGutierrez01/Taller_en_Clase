package hilos.vista;

import hilos.clase.auto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class datosVista extends JFrame {

    private JLabel txtMarca;
    private JLabel txtModelo;
    private JLabel txtPrecio;
    private JButton salir;
    private JLabel lbMarca;
    private JLabel lbModelo;
    private JLabel lbPrecio;

    public datosVista(auto auto1) {
        setTitle("Datos del Auto");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Marca
        lbMarca = new JLabel("Marca:");
        lbMarca.setBounds(30, 20, 80, 25);
        add(lbMarca);

        txtMarca = new JLabel(auto1.getMarca());
        txtMarca.setBounds(120, 20, 130, 25);
        add(txtMarca);

        // Modelo
        lbModelo = new JLabel("Modelo:");
        lbModelo.setBounds(30, 60, 80, 25);
        add(lbModelo);

        txtModelo = new JLabel(auto1.getModelo());
        txtModelo.setBounds(120, 60, 130, 25);
        add(txtModelo);

        // Precio
        lbPrecio = new JLabel("Precio:");
        lbPrecio.setBounds(30, 100, 80, 25);
        add(lbPrecio);

        txtPrecio = new JLabel(String.valueOf(auto1.getPrecio()));
        txtPrecio.setBounds(120, 100, 130, 25);
        add(txtPrecio);

        // Botón salir
        salir = new JButton("Regresar");
        salir.setBounds(80, 150, 130, 30);
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autoVista autoVista = new autoVista();
                autoVista.setVisible(true);
                dispose();
            }
        });
        add(salir);
    }
}
