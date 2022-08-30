import javax.swing.*;
import java.sql.Time;

public class MainProgrem {

    public static void main(String[] args) {
        System.out.println("hihi");

        Property p1 = new Property("Erzbergerstraße 1", 20, 20.5);
        System.out.println(p1.getAddress() + " - " + p1.getSize() + "m²");

        Property p2 = new Property("Erzbergerstraße 2", 40, 40.5);
        System.out.println(p2.getAddress() + " - " + p2.getSize() + "m²");

        Property p3 = new Property("Erzbergerstraße 3", 60, 60.5);
        System.out.println(p3.getAddress() + " - " + p3.getSize() + "m²");

        Property p4 = new Property("Erzbergerstraße 4", 80, 80.5);
        System.out.println(p4.getAddress() + " - " + p4.getSize() + "m²");

        Property p5 = new Property("Erzbergerstraße 5", 100, 100.5);
        System.out.println(p5.getAddress() + " - " + p5.getSize() + "m²");


       /*int Timer = 6;

        System.out.println(Timer);
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setBounds(500, 500, 100, 100);

        frame.repaint();

        while (Timer >= 5){

            return;
        }
        frame.setVisible(false);*/
    }



}
