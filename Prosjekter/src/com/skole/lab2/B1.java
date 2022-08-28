package com.skole.lab2;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.lang.Math.*;
public class B1 {
    public static void main(String[] args) {
        double raduis = Double.parseDouble(JOptionPane.showInputDialog("Radius"));
        double test = 4.0 / 3.0;
        double test2 = Math.pow(raduis, 3);
        double resultat = test * Math.PI * test2;
        JOptionPane.showMessageDialog(null, resultat);
    }
}
