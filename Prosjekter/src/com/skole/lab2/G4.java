package com.skole.lab2;

import static javax.swing.JOptionPane.*;

public class G4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            System.out.println(Integer.parseInt(showInputDialog("Input: " + i)));
        }
    }
}
