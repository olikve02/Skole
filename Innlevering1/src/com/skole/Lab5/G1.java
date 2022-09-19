package com.skole.Lab5;

public class G1 {
    public static void main(String[] args) {
        int[] tabell = {1, 3, 4, 7, 9, 10};
        int[] motsattTabell = skiftFortegn(tabell);
        for(int tall : motsattTabell){
            System.out.println(tall);
        }
    }
    public static void skrivUt(int[] tabell){
        for(int tall:tabell){
            System.out.println(tall);
        }
    }
    public static void finnes(int[] tabell, int tallSkjekk){
        boolean harVerdi = false;
        for(int tall : tabell) {
            if (tall == tallSkjekk) {
                System.out.println("Har verdi");
            }else{
                System.out.println("Har ikke verdi");
            }
        }
    }
    public static int[] skiftFortegn(int[] tabell){
        int[] endretTabell = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            endretTabell[i] = tabell[i] * (-1);
        }
        return endretTabell;
    }


}
