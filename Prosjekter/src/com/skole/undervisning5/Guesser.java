package com.skole.undervisning5;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.util.concurrent.ThreadLocalRandom;

public class Guesser {
    public static void main(String[] args) {
        int secretNum = 0;
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        int max = 1000;
        int min = 0;

        //skjekker at input er mellom min og max, hvis ikke ber programmet om input på nytt
        do{
            JOptionPane.showMessageDialog(null, "Skriv inn ett nummer fra " + min + " - " + max);
            secretNum = Integer.parseInt(JOptionPane.showInputDialog("Hemmelig nummer: "));
        }while(secretNum < min || secretNum > max);

        //første gjett er ett tilfeldig tall mellom min og max
        guess1 = ThreadLocalRandom.current().nextInt(min,max);

        //skjekker om første gjett er høyere eller lavere enn det hemmlelige nummeret
        //hvis gjettet er lavere blir andre gjett fra gjett 1 til 1000
        //hvis det første gjettet var større blir andre gjett fra gjett 1 til 0
        if (guess1 > secretNum){
            guess2 = ThreadLocalRandom.current().nextInt(min, guess1);
            System.out.println(guess1 + " > " + secretNum);
        }else {
            guess2 = ThreadLocalRandom.current().nextInt(guess1, max);
        }
        //finner mellom gjett en og to og setter det som gjett 3
        guess3 = (guess1 + guess2) / 2;

        String utTxt =
                "Secret num: " + secretNum +
                "\n Gjett 1: " + guess1 +
                "\n Gjett 2: " + guess2 +
                "\n Gjett 3: " + guess3;

        JOptionPane.showMessageDialog(null, utTxt);




    }
}
