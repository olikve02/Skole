package com.skole.lab2;
import static javax.swing.JOptionPane.*;


public class V1 {
    public static void main(String[] args) {
        int tall1 = Integer.parseInt(showInputDialog("Tall1"));
        int tall2 = Integer.parseInt(showInputDialog("Tall2"));
        int tall3 = Integer.parseInt(showInputDialog("Tall3"));
        String utTxt = "";

        if(tall1 > tall2 && tall1 > tall3){
            if(tall2 > tall3){
                utTxt = tall1 + ", " + tall2 + ", " + tall3;
            }else{
                utTxt = tall1 + ", " + tall3 + ", " + tall2;
            }

        } else if (tall2 > tall1 && tall2 > tall3) {
            if(tall1 > tall3){
                utTxt = tall2 + ", " + tall1 + ", " + tall3;
            }else{
                utTxt = tall2 + ", " + tall3 + ", " + tall1;
            }
        }else{
            if(tall1 > tall2){
                utTxt = tall3 + ", " + tall1 + ", " + tall2;

            }else{
                utTxt = tall3 + ", " + tall2 + ", " + tall1;
            }
        }
        showMessageDialog(null, utTxt);
   }
}
