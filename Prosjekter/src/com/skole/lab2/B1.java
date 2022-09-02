package com.skole.lab2;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.lang.Math.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B1 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(showInputDialog("Input"));
        int areal = (int)((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        showMessageDialog(null, areal);
    }
}
