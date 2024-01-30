package encapsulation;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("ingrese la direccion:"));
        agency.setAgentName(JOptionPane.showInputDialog("nombre de la agencia"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("precio:")));
        JOptionPane.showMessageDialog(null,"nombre de la agencia"+agency.getAgentName());
    }
}
