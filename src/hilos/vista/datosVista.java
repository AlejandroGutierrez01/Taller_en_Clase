package hilos.vista;

import hilos.clase.auto;

import javax.swing.*;

public class datosVista extends JFrame {

    private JLabel txtMarca;
    private JLabel txtModelo;
    private JLabel txtPrecio;
    private JButton salir;
    private JLabel lbMarca;
    private JLabel lbModelo;
    private JLabel lbPrecio;
    auto auto;
    public datosVista () {
        // Marca


        lbMarca = new JLabel("Marca:");
        lbMarca.setBounds(30, 20, 80, 25);
        add(lbMarca);

        txtMarca = new JLabel(auto.getMarca());
        txtMarca.setBounds(120, 20, 130, 25);
        add(txtMarca);

        // Modelo
        lbModelo = new JLabel("Modelo:");
        lbModelo.setBounds(30, 60, 80, 25);
        add(lbModelo);

        txtModelo = new JLabel();
        txtModelo.setBounds(120, 60, 130, 25);
        add(txtModelo);

        // Precio
        lbPrecio = new JLabel("Precio:");
        lbPrecio.setBounds(30, 100, 80, 25);
        add(lbPrecio);

        txtPrecio = new JLabel();
        txtPrecio.setBounds(120, 100, 130, 25);
        add(txtPrecio);

        // Botón procesar
        salir = new JButton("Procesar Auto");
        salir.setBounds(80, 150, 130, 30);
        add(salir);
    }
}
