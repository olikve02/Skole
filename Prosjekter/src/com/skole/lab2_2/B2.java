package com.skole.lab2_2;

import static javax.swing.JOptionPane.*;

public class B2 {
    public static void main(String[] args) {
        double x = Double.parseDouble(showInputDialog("X"));
        double n = Double.parseDouble(showInputDialog("N"));
        int N = (int)n;
        double result = 1;
        double test = 1;

        while (n > 0){
            result = result * x;
            n--;
        }
        String løkkeTxt = "Regnet ut med while løkke:" +
                "\n         " + x + " ^ " + N + " = " + result;

        showMessageDialog(null, løkkeTxt);
        String mathTxt = "Regnet ut med math bibliotek \n" +
                        x + " ^ " + N  + " = " + Math.pow(x,N);

        showMessageDialog(null, mathTxt);

    }
}
