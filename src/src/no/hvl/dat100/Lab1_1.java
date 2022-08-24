package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class Lab1_1 {
    public static void main(String[] args) {
        int tall1 = Integer.parseInt(showInputDialog("tall 1"));
        int tall2 = Integer.parseInt(showInputDialog("tall 2"));

        int sum = regnUt(tall1,tall2);
        showMessageDialog(null, sum);
    }
    public static int regnUt(int a, int b){
        return a+b;
    }
}
