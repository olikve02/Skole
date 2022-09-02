package com.skole.edabit;

import static javax.swing.JOptionPane.*;
public class Sales {
    public static void main(String[] args) {
        double price = Double.parseDouble(showInputDialog("Price"));
        double discount = Double.parseDouble(showInputDialog("Discount %"));
        double percent = discount / 100;
        int result = (int)(price * percent);
        showMessageDialog(null, result);

    }
}
