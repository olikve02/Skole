package com.skole.challenges;

import static javax.swing.JOptionPane.*;

public class Challenge_6 {
    public static void main(String[] args) {
        int tall = Integer.parseInt(showInputDialog("Input number"));
        int reversed = 0;

        while(tall != 0){
            /*setter siffer lik det siste sifferet i tallet
              ved å ta heltalldivisjon; som gir det som er i rest etter deling*/
            int digit = tall % 10;
            reversed = reversed * 10 + digit;
            tall = tall / 10;
            System.out.println(reversed);
        }

    }
}
