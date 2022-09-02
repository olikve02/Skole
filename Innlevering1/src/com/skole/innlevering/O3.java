package com.skole.innlevering;

import static javax.swing.JOptionPane.*;

public class O3 {
    public static void main(String[] args) {
        int tall = Integer.parseInt(showInputDialog("N!: "));
        int resultat = 1;
        String utTxt = "";
        while(tall >= 1){
            resultat = tall * resultat;
            tall--;
        }
        showMessageDialog(null, resultat);

    }
}
