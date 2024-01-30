package encapsulation;

import javax.swing.*;

public class mainPersona {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName(JOptionPane.showInputDialog("ingrese el nombre"));
        System.out.println(person.getName());

        Person person2 = new Person();
        person2.setName("pepe");
    }
}
