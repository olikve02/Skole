package com.skole.lab2;

import static javax.swing.JOptionPane.*;

public class B5 {
    public static void main(String[] args) {
        int poeng = Integer.parseInt(showInputDialog("Student nr 1: "));
        String karakter = "";

        for (int i = 0; i < 10; i++) {
            if(poeng < 0){
                showMessageDialog(null, "Poengsum kan ikke være mindre enn 0");
            } else if(poeng <= 39){
                karakter = "F";
                UtTxt(karakter);
            } else if (poeng <= 49) {
                karakter = "E";
                UtTxt(karakter);
            } else if (poeng <= 59) {
                karakter = "D";
                UtTxt(karakter);
            } else if (poeng <= 69) {
                karakter = "C";
                UtTxt(karakter);
            } else if (poeng <= 89) {
                karakter = "B ";
                UtTxt(karakter);
            } else if (poeng <= 90) {
                karakter = "A";
                UtTxt(karakter);
            } else if (poeng > 100) {
                showMessageDialog(null, "Poengsum kan ikke være mer enn 100");
            }
            poeng = Integer.parseInt(showInputDialog("Student nr: " + (i+2)));
        }


    }
    public static void UtTxt(String karakter){
        showMessageDialog(null, karakter);
    }
}
