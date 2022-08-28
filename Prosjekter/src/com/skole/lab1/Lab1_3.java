package com.skole.lab1;

import static javax.swing.JOptionPane.*;

public class Lab1_3 {
    public static void main(String[] args) {
        int dag = Integer.parseInt(showInputDialog("Dag"));
        String måned = showInputDialog("Måned");

        if (Integer.parseInt(måned) < 12){
            måned = 0 + måned;
        }
        int år = Integer.parseInt(showInputDialog("År"));

        //Lag og skriv ut text string
        String utTxt = dag + "." + måned + "." + år;
        showMessageDialog(null, utTxt);

    }
}
