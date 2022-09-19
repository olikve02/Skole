package com.skole.Lab5;

import static java.lang.Integer.compare;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class B2 {
    public static void main(String[] args) {
        int bredde = lesInntall("bredde");
        int høyde = lesInntall("høyde");

        int areal= areal(bredde,høyde);

        showMessageDialog(null,"Areal: " + areal);
    }

    private static int areal(int bredde, int hoyde) {
        int flateareal = bredde * hoyde;

        return flateareal;
    }
    public static int lesInntall(String message){
        int tall = 0;
        do{
            tall = parseInt(showInputDialog(message));
        }while (tall < 0);

        return tall;
    }
}
