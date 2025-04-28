package hilos.clase;

public class proceso_C extends Thread{
    private int n;
    //contructor

    public proceso_C(int n){
        this.n=n;
    }

    public void dividir (int n){
        for (int i = 10; i>-2;i--){
            System.out.println("Iteracion N: "+ n/i);
        }
    }


    @Override
    public void run() {
        dividir(n);
    }
}
