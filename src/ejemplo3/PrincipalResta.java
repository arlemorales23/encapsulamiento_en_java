package ejemplo3;

import com.sun.tools.javac.Main;

import javax.swing.*;
import java.util.Scanner;

public class PrincipalResta {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Resta resta = new Resta();

        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "1. consultar 2. editar 3. salir"));
        System.out.println("ingrese el numero 1");
        resta.setN1(lector.nextInt());
        resta.setN2(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el número 2")));
        System.out.println(resta.getN1() - resta.getN2());
        JOptionPane.showMessageDialog(null, "Esta es la resta " + resta.restar());
    }
}
