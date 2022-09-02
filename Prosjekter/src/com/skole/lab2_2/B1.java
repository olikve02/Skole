package com.skole.lab2_2;

import static javax.swing.JOptionPane.*;

public class B1 {
    public static void main(String[] args) {
        double min = Double.parseDouble(showInputDialog("Min"));
        double max = Double.parseDouble(showInputDialog("Max"));

        String utTxt = "";

        for (double i = min; i <= max; i++) {
            if(i % 2 == 0){
                utTxt = utTxt + i + ", ";
            }
        }

        utTxt = utTxt.substring(0, utTxt.length() - 2);
        showMessageDialog(null, utTxt);
    }
}
