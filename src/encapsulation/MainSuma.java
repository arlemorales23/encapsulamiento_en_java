package encapsulation;

import javax.swing.*;

public class MainSuma {
    public static void main(String[] args) {
        Suma suma = new Suma();
        suma.setNumber1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero:")));
        suma.setNumber2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: ")));
        JOptionPane.showMessageDialog(null,"La suma es "+suma.sumar());
    }
}
