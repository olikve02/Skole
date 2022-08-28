package com.skole.lab2;

import static javax.swing.JOptionPane.*;

public class G3 {
    public static void main(String[] args) {
        //input
        double tall1 = Double.parseDouble(showInputDialog("tall1"));
        double tall2 = Double.parseDouble(showInputDialog("tall2"));

        Divide(tall1, tall2);



    }
    //Funksjon for å dele
    public static void Divide(double tall1, double tall2){
        double resultat = 0;
        if(tall2 <= 0){
            showMessageDialog(null, "Nevner kan ikke være minder enn 1");
        }else{
            resultat = tall1 / tall2;
            showMessageDialog(null, resultat);

        }
    }
}
