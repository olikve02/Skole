package com.skole.challenges;

import com.skole.challenges.MD5Hash.Data;

import java.util.zip.CheckedInputStream;

import static javax.swing.JOptionPane.*;
public class LetterSumValue {
    public static void main(String[] args) {
        Data data = new Data();
        String input = showInputDialog("Input");
        char[] chars = input.toCharArray();
        int sum = 0;
        int value = 0;
        int presum = 0;
        for (char bokstav : chars){
            for(String ord : data.binary){
                if(bokstav == ord.charAt(0)){
                     value = Integer.parseInt(ord.substring(1, ord.length()));
                     sum = sum + value;

                }
            }
        }
        showMessageDialog(null, sum);
    }
}
