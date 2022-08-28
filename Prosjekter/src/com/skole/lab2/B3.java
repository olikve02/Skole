package com.skole.lab2;

import static javax.swing.JOptionPane.*;

public class B3 {
    public static void main(String[] args) {
        //Input
        String inputBrukernavn = showInputDialog("Brukernavn");
        String inputPassord = showInputDialog("Passord");

        showMessageDialog(null, Skjekker(inputBrukernavn, inputPassord));
    }

    public static String Skjekker(String inputBrukernavn, String inputPassord){

        //Setter brukernavn og passord
        String brukernavn = "olikve02";
        String passord = "Makamamma1";
        String utTxt = "";

        //Skjekker om input stemmer med brukernavn og passord
        if(brukernavn.equals(inputBrukernavn) && !passord.equals(inputPassord)){
            utTxt = "Inncorect password";
        }else if(brukernavn.equals(inputBrukernavn) && passord.equals(inputPassord)){
            utTxt = "Signed in";
        }else{
            utTxt = "No user with that username exsists";
        }
        //gir tilbake enten logget inn eller ikke
        return utTxt;
    }
}
