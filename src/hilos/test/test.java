package hilos.test;
import hilos.clase.*;
public class test {
    public static void main(String[] args) {
//        persona p = new persona();
//        p.setDireccion("Av Amazonas y estocolmo");
//        p.setNombre("Alejandro");
//        p.setFechaNac("07/09/2004");
//        System.out.println("Nombre: "+p.getNombre());
//        System.out.println("Dirreción: "+p.getDireccion());
//        System.out.println("Fecha de Nacimiento: "+p.getFechaNac());
        proceso_A a = new proceso_A("Juan");
        proceso_B b = new proceso_B(20);
        proceso_C c = new proceso_C(5);
        Runnable x = new proceso_D(100);
        Thread d = new Thread(x);
        Runnable y = new proceso_E("la raiz cuadrada de un triangulo isosceles es la suma de los cuadrados de sus catetos");
        Thread e = new Thread(y);
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
