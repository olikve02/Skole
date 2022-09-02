package com.skole.challenges;

import static javax.swing.JOptionPane.*;

public class Stutter {
    public static void main(String[] args) {
        String ord = showInputDialog("input");
        String toFørsteBokstaver = String.valueOf(ord.charAt(0)) + ord.charAt(1);
        String utTxt = toFørsteBokstaver + "... " + toFørsteBokstaver + "... " + ord;
        System.out.println(utTxt);
    }
}
