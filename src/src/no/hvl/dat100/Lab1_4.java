package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Lab1_4 {
    public static void main(String[] args) {
        System.out.println("/: " + 3690.0 / 3600.0);
        System.out.println("%: " + 3690.0 % 3600.0);

       double sekund = Double.parseDouble(showInputDialog("Sekunder"));

       double timer = sekund / 3600;
       double minutter = sekund % 3600;


       System.out.println(timer);
       System.out.println(minutter);



    }
}
