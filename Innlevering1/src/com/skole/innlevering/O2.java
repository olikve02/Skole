package com.skole.innlevering;

import static javax.swing.JOptionPane.*;

public class O2 {
    public static void main(String[] args) {
        int poeng = Integer.parseInt(showInputDialog("Student nr 1: "));
        String karakter = "";

        for (int i = 0; i < 9; i++) {
            if(poeng < 0 || poeng > 100){
                showMessageDialog(null, "Poengsum må være mellom 0-100");
                i--;
            } else if(poeng <= 39){
                UtTxt("F");
            } else if (poeng <= 49) {
                UtTxt("E");
            } else if (poeng <= 59) {
                UtTxt("E");
            } else if (poeng <= 69) {
                UtTxt("C");
            } else if (poeng <= 89) {
                UtTxt("B");
            } else if (poeng >= 90) {
                UtTxt("A");
            }
            poeng = Integer.parseInt(showInputDialog("Student nr: " + (i+2)));
        }
    }
    public static void UtTxt(String karakter){
        showMessageDialog(null, karakter);
    }
}
