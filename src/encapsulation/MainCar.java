package encapsulation;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("placa: "));
        car.setColor(JOptionPane.showInputDialog("color: "));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("modelo: ")));
        JOptionPane.showMessageDialog(null,car.getPlate());
    }
}
