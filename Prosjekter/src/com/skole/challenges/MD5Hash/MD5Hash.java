package com.skole.challenges.MD5Hash;

import static javax.swing.JOptionPane.*;

public class MD5Hash {
    public static void main(String[] args) {
        Data data = new Data();

        String input = showInputDialog("Convert to MD5 hash:");
        char[] chars = input.toCharArray();
        String utTxt = "";
        for(char bokstav : chars){
            for (int i = 0; i <= 27 ; i++) {

                if(bokstav == data.binary[i].charAt(0)){
                    utTxt = utTxt + data.binary[i].substring(1, data.binary[i].length()) + ", ";
                }
            }
        }
        System.out.println(utTxt);
    }
}
