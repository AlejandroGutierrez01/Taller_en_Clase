package hilos.clase;

import hilos.vista.autoVista;

public class proceso_F extends Thread {
    @Override
    public void run() {
        autoVista autoVista = new autoVista();
        autoVista.setVisible(true);
    }
}
