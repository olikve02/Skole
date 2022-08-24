package no.hvl.dat100.no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Lab1_3 {
    public static void main(String[] args) {
        int dag = Integer.parseInt(showInputDialog("Dag"));
        String måned = showInputDialog("Måned");

        if (Integer.parseInt(måned) < 12){
            måned = 0 + måned;
        }
        int år = Integer.parseInt(showInputDialog("År"));

        String utTxt = dag + "." + måned + "." + år;
        showMessageDialog(null, utTxt);

    }
}
