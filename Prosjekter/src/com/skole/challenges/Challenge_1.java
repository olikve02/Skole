package com.skole.challenges;

import static javax.swing.JOptionPane.*;


public class Challenge_1 {
    public static void main(String[] args) {
        String text = showInputDialog("Skriv tekst");
        String[] ord = text.split("\\W+");
        String utTxt = "";

        for (int i = ord.length - 1; i > 0; i--) {
               utTxt = utTxt + " " + ord[i];
        }
        System.out.println(utTxt);

    }
}
