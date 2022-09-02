package com.skole.challenges;

import java.util.ArrayList;
import static javax.swing.JOptionPane.*;
public class OddePar {
     int street = 0;
    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();

        String partall = "";
        String oddetall = "";

        for (int i = 1; i < 11 ; i++) {
            inputs.add(Integer.parseInt(showInputDialog("Input")));
        }
        for(int input : inputs){
            if(input % 2 == 0){
                partall = partall + " " + input;
            }else{
                oddetall = oddetall + " " + input;
            }
        }

        String utTxt = "Partall: " + partall + "\n" + "Oddetall: " + oddetall;
        showMessageDialog(null, utTxt);
    }


}
