package clase.test;

import clase.impl.OperacionesImpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.util.Scanner;

public class OperacionesTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double y;
        double x;
        x = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el primer numero"));
        y = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el segundo numero"));
        Operaciones op = new OperacionesImpl();
        System.out.println("La suma es: "+op.sumar(x,y));
        System.out.println("La resta es: "+op.restar(x,y));
        System.out.println("La dividir es: "+op.dividir(x,y));
        System.out.println("La multiplicar es: "+op.multiplicar(x,y));
        JOptionPane.showMessageDialog(null,"La respuesta es: " + op.sumar(x,y));

    }
}
