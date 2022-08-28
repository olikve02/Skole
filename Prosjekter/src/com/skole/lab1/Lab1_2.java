package com.skole.lab1;

import static javax.swing.JOptionPane.*;
import java.util.Scanner;
public class Lab1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] tall = {0,0,0,0};

        for (int i = 0; i <= 3; i++) {
            tall[i] = Integer.parseInt(showInputDialog("Tall " + i));
            System.out.print(tall[i]);
        }
        int[] sum = {0,0};

        sum[0] = Math.min(tall[0], tall[1]);
        sum[1] = Math.min(tall[2], tall[3]);

        String utTxt = "Minste tallet er: " + Math.min(sum[0],sum[1]);

        showMessageDialog(null, utTxt);



    }
}
