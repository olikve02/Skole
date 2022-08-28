package com.skole.lab2;

import javax.swing.*;
import  javax.swing.JOptionPane.*;

public class B2 {
    public static void main(String[] args) {
        //Input
        double pris = Integer.parseInt(JOptionPane.showInputDialog("Pris"));
        double beløp = Integer.parseInt(JOptionPane.showInputDialog("Beløp"));

        //Regning
        double differanse = pris - beløp;
        System.out.println(differanse);
        double enere = differanse % 10;
        System.out.println("enere " + enere);
        int tiere = (int)differanse / 10;
        System.out.println("tiere " + tiere);

        //output
        String utTxt = "Enere:" + enere + "\n Tiere:" + tiere;
        JOptionPane.showMessageDialog(null, utTxt);

    }
}
