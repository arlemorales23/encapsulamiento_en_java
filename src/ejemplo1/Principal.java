package ejemplo1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Suma suma = new Suma();

        suma.n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero 1: "));
        suma.n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "numero 2: "));

        JOptionPane.showMessageDialog(null, "el resultadop es " + suma.sumar());

    }
}
