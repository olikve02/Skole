package com.skole.challenges;

import javax.swing.*;
import javax.swing.JOptionPane.*;
import java.util.ArrayList;

public class StringReverser {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Input");
        String reversed = "";

        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            reversed = reversed + " " + chars[i];
        }
        JOptionPane.showMessageDialog(null, reversed);
    }
}
