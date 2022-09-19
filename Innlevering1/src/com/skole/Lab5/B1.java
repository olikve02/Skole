package com.skole.Lab5;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class B1 {
    public static void main(String[] args) {
        System.out.println(utTxt(utregning()));

    }


    public static double[][] utregning(){
        double[] sin = new double[180/12];
        double[] cos = new double[180/12];
        double[] radianer = new double[180/12];
        int i = 0;
        DecimalFormat df = new DecimalFormat("#.###");

        for (int grader = 0; grader < 180; grader += 15) {
            radianer[i] = (Math.PI * grader) / 180;
            sin[i] = Math.sin(grader);
            cos[i] = Math.cos(grader);
            i++;
        }
        double [][] values = {
                sin, cos, radianer
        };

        return values;
    }

    public static String utTxt(double[][] values){
        int i = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        String utTxt = "";
        String startTxt =
                "x i grader   x i radiander   sin(x)   cos(x) \n" +
                "-------------------------------------------- \n";
        System.out.print(startTxt);
        for (int grader = 0; grader <= 180; grader += 15) {
            utTxt = utTxt + "      " + grader + "         " + df.format(values[2][i]) + "      " + df.format(values[0][i]) + "     " + df.format(values[1][i]) + "\n";
            i++;
        }

        System.out.println(utTxt);
        return "";
    }
}
