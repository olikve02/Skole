package com.skole.challenges;

import static javax.swing.JOptionPane.*;
public class Challenge_3 {
    public static void main(String[] args) {
        String keyWord = "hei";
        String input = showInputDialog("Text");
        String[] words = input.split("\\W");

        int i = 0;

        for (String word : words) {
            if (word.equals(keyWord)){
                i++;
            }
        }
        String utTxt = "Ordet " + keyWord + " ble funnet " + i + " ganger";
        showMessageDialog(null,utTxt);
    }
}
