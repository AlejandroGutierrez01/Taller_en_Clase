package hilos.clase;

import javax.swing.*;
import java.awt.*;

public class proceso_E implements Runnable {

    private String mensaje;

    public proceso_E(String m){
        mensaje=m;
    }

    public void ventana(String mensaje){
        JOptionPane.showMessageDialog(null," "+mensaje);
    }

    @Override
    public void run() {
        ventana(mensaje);
    }
}
