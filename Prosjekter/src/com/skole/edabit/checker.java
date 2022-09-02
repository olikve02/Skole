package com.skole.edabit;

import static javax.swing.JOptionPane.*;

public class checker {
    public static void main(String[] args) {
        String txt1 = showInputDialog("Input");
        String txt2 = showInputDialog("Input");
        //fjerner n antall bokstaver bakerst av txt1 der n er lengden av txt2
        String bakdel1 = txt1.substring(txt1.length() - txt2.length(), txt1.length());
        //skjekker om bakdel er det samme som txt2
        if (bakdel1.equals(txt2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
