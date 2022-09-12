package com.skole.test;
import static javax.swing.JOptionPane.*;
public class Test {
    public static void main(String[] args) {
        double[] observasjoner = {1.2, 3.5, 4.8, 7.9, 41.2, 10.1};
        int grense = Integer.parseInt(showInputDialog("Grense"));
        int count = 0;
        for(double obs : observasjoner){
            if (obs > grense) {
                count++;
            }
        }
        System.out.println(count);
    }
}
