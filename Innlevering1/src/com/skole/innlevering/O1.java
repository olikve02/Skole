package com.skole.innlevering;

import static javax.swing.JOptionPane.*;

public class O1 {
    public static void main(String[] args) {
        int inntekt = Integer.parseInt(showInputDialog("Input"));
        int nettoLønn = 0;
        String trinn = "";
        String utTxt = "";
        if(inntekt <= 267899){
            //trinn 1
            trinn = "Trinn 1";
            nettoLønn = (int)(inntekt * 0.983);

        } else if (inntekt <= 643799) {
            //trinn 2
            trinn = "Trinn 2";
            nettoLønn = (int)(inntekt * 0.96);
        } else if (inntekt <= 969199) {
            //Trinn 3
            trinn = "Trinn 3";
            nettoLønn = (int)(inntekt * 0.866);
        }else if (inntekt <= 1999999){
            //Trinn 4
            trinn = "Trinn 4";
            nettoLønn = (int)(inntekt * 0.836);
        }else{
            //Trinn 5
            trinn = "Trinn 5";
            nettoLønn = (int)(inntekt * 0.826);
        }

        utTxt = "Lønn etter " + trinn + ": " + nettoLønn;
        showMessageDialog(null, utTxt);

    }
}
