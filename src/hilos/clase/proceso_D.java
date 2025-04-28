package hilos.clase;

import static java.lang.Thread.sleep;

public class proceso_D implements Runnable {

    private int n;

    public proceso_D(int numero) {
        n = numero;
    }

    public void cadena(int n){
        for (int i = 0; n > i; n--){
            System.out.println(n+"*******************");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        cadena(n);

    }
}
