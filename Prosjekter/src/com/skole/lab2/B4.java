package com.skole.lab2;

import static javax.swing.JOptionPane.*;

public class B4 {
    public static void main(String[] args) {
        int inntekt = Integer.parseInt(showInputDialog("Inntekt"));
        double trinnskatt = 0;
        String utTxt = "";

        //Skjekker hviket trinn inntekten ligger på også ganger med 1 - trinnskatten
        if(inntekt <= 190349){
            trinnskatt = (inntekt * 0.983);
            utTxt = "" + trinnskatt;
        } else if (inntekt <= 267900) {
            trinnskatt = inntekt * 0.96;
            utTxt = "" + trinnskatt;
        } else if (inntekt <= 643800) {
            trinnskatt = inntekt * 0.866;
            utTxt = "" + trinnskatt;
        } else if (inntekt <= 969200) {
            trinnskatt = inntekt * 0.836;
            utTxt = "" + trinnskatt;
        }else{
            trinnskatt = inntekt * 0.826;
        }
        //Output
        showMessageDialog(null, "Inntekt etter trinnskatt: " + utTxt);

    }
}
