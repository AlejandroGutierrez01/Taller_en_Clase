package hilos.clase;

public class proceso_A extends Thread{
    private String name;
    public  proceso_A (String name){
        this.name = name;
    }

    public void saludar (String name){
        System.out.println("Saludos "+ name);
    }

    @Override
    public void run() {
        saludar(name);
    }
}
