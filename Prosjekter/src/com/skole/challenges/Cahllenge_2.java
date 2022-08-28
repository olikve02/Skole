package com.skole.challenges;

import static javax.swing.JOptionPane.*;

public class Cahllenge_2 {
    public static void main(String[] args) {
       String txt = showInputDialog("Input");
       String[] ord = txt.split("\\W");

       int ordNr = Integer.parseInt(showInputDialog("Input"));
       showMessageDialog(null, ord[ordNr - 1]);


    }
}
