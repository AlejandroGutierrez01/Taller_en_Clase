package hilos.vista;

import hilos.clase.auto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class autoVista extends JFrame{
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtPrecio;
    private JButton procesar;
    private JLabel lbMarca;
    private JLabel lbModelo;
    private JLabel lbPrecio;

    public autoVista(){

        setTitle("Autos");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Marca
        lbMarca = new JLabel("Marca:");
        lbMarca.setBounds(30, 20, 80, 25);
        add(lbMarca);

        txtMarca = new JTextField();
        txtMarca.setBounds(120, 20, 130, 25);
        add(txtMarca);

        // Modelo
        lbModelo = new JLabel("Modelo:");
        lbModelo.setBounds(30, 60, 80, 25);
        add(lbModelo);

        txtModelo = new JTextField();
        txtModelo.setBounds(120, 60, 130, 25);
        add(txtModelo);

        // Precio
        lbPrecio = new JLabel("Precio:");
        lbPrecio.setBounds(30, 100, 80, 25);
        add(lbPrecio);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(120, 100, 130, 25);
        add(txtPrecio);

        // Botón procesar
        procesar = new JButton("Procesar Auto");
        procesar.setBounds(80, 150, 130, 30);
        add(procesar);

        procesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String marca = txtMarca.getText();
                    String modelo = txtModelo.getText();
                    int precio = Integer.parseInt(txtPrecio.getText());

                    auto auto1 = new auto();
                    auto1.setMarca(marca);
                    auto1.setModelo(modelo);
                    if(precio > 0) {
                        auto1.setPrecio(precio);
                        datosVista datos = new datosVista(auto1);
                        datos.setVisible(true);
                        dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Ingrese un precio válido.");
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un precio válido.");
                }
            }
        });
    }
}
