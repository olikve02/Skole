package com.skole.lab2;

import javax.swing.*;
import  javax.swing.JOptionPane.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class B2 {
    public static void main(String[] args) {

        //Input
        int pris = Integer.parseInt(showInputDialog("Pris"));
        int beløp = Integer.parseInt(showInputDialog("Beløp"));

        //Regning
        int differanse = pris - beløp;
        int kr = differanse % 10;
        int tiKrone = (differanse / 10) % 10;
        int hundreLapp = differanse / 100;

        //Output
        String utTxt =
                "Differanse: " + differanse +
            "\n  Hundre-lapp: " + hundreLapp +
            "\n  Ti-kroner: " + tiKrone +
            "\n  En-kroner: " + kr;

        showMessageDialog(null, utTxt);
    }
}
