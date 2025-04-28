package hilos.clase;

public class proceso_B extends Thread {
    private int n;

    public proceso_B(int n){
        this.n=n;
    }
    public void contar (int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        contar(n);
    }
}