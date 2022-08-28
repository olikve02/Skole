package com.skole.challenges;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class Challenges_5 {
    public static void main(String[] args) {
        String input = showInputDialog("Input text");
        String[] words = input.split("\\W");
        String alphabet = "abcdefghijklmnpoqrstuvwxyz";

        char[] alpLetters = alphabet.toCharArray();
        //Lage array som kan endre størrelse
        ArrayList<String> usedLetters = new ArrayList<String>();
        int i = 0;

        for(String word : words){
            char[] letters = word.toCharArray();
            for(char letter : letters){
                for (char alpLetter : alpLetters){
                    for(String usedLetter : usedLetters){
                        if (alpLetter == letter || !String.valueOf(letter).equals(usedLetter)){
                            String letterStr = String.valueOf(letter);
                            usedLetters.add(letterStr);
                            i++;
                            System.out.println("letter found");
                        }else if (i >= 26){
                            System.out.println("alle");
                        }
                    }


                }
            }
        }

    }
}
