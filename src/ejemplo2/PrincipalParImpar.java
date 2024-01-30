package ejemplo2;

import javax.swing.*;

public class PrincipalParImpar {
    public static void main(String[] args) {
        ParImpar parimpar = new ParImpar();
        parimpar.number1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        JOptionPane.showConfirmDialog(null, parimpar.calc());

    }
}
