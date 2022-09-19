package com.skole.Lab5;

public class B4 {
    public static void main(String[] args) {
        int[] tempraturer = {13,11,10,10,8,9,12};
        System.out.println("Analyse av tempraturer \n" + "**********************");
        int sum = 0;
        for(int tempratur : tempraturer){
            sum += tempratur;
            int max = Math.max(tempratur, tempratur);
        }
        int gjennomsnittTemp = sum / 7;
        System.out.println("Gjennomsnitt tempraturen er " + gjennomsnittTemp);

    }
}
