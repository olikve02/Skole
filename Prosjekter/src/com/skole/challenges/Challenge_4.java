package com.skole.challenges;

import static javax.swing.JOptionPane.*;

public class Challenge_4 {
    public static void main(String[] args) {
        String input1 = showInputDialog("Ord 1");
        String input2 = showInputDialog("Ord 2");

        char[] words1 = input1.toCharArray();
        char[] words2 = input2.toCharArray();
        int i = 0;
        for (char word1 : words1){
           for (char word2 : words2){
               if (word1 == word2){
                   i++;
                   if (i >= words1.length){
                       showMessageDialog(null, "Anagram");
                   }
               }
           }
        }
    }
}
