package com.skole.edabit;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class SevenBoom {
    public static void main(String[] args) {
        int memory = 0;
        int number = Integer.parseInt(showInputDialog("Check if there is a 7 in number: "));
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(number > 0){
            int digit = number % 10;
            numbers.add(digit);
            number = number / 10;
        }
        for(int tall : numbers){
            if(tall == 7){
                memory++;
            }
        }
        if (memory != 0){
            showMessageDialog(null, "Boom!");
        }else{
            showMessageDialog(null, "There is no 7 in the array");
        }
    }
}
