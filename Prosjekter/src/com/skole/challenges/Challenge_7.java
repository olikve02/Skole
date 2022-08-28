package com.skole.challenges;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class Challenge_7 {


    public static void main(String[] args) {
        boolean isArnold = false;
        int tall = Integer.parseInt(showInputDialog("Tall"));
        int tall1 = tall;
        ArrayList<Integer> digits = new ArrayList<Integer>();

        while(tall != 0) {
            int digit = tall % 10;
            tall = tall / 10;
            digits.add(digit);
        }
       isArnold = Calculate(digits, tall1);
        System.out.println(isArnold);
    }


    public static boolean Calculate(ArrayList<Integer> siffer, int tall){
        boolean armstrongNum = false;
        double result = 0;
        int finResult = 0;
        for(int digit : siffer){
            result = result + Math.pow(digit,siffer.size());
            finResult = (int)result;
        }
        System.out.println(finResult);
        System.out.println(tall);
        if(finResult == tall){
            armstrongNum = true;

        }
        return armstrongNum;
    }
}
    //double a = Math.pow(8,4),  b = Math.pow(2,4), c = Math.pow(0,4), d = Math.pow(8,4);
