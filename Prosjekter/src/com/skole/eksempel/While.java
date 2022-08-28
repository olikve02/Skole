package com.skole.eksempel;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class While {
    public static void main(String[] args) {
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        int input = 1;
        int sum = 0;
        double gjennomsnitt = 0;

        while(input != 0){
            input = Integer.parseInt(JOptionPane.showInputDialog("Høyde"));
            inputs.add(input);
            sum += input;
            System.out.println(sum);
        }
        gjennomsnitt = sum / (inputs.size() -1) ;
        System.out.println("Gjennomsnitt: " + gjennomsnitt);



    }
}
