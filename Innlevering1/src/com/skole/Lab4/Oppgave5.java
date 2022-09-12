package com.skole.Lab4;
public class Oppgave5 {

    public static void main(String[] args) {

        System.out.println("Del 2");
        for (int j = 1; j < 8; j = j * 2) {
            System.out.println("Nr 2, j = " + j);
        }
        System.out.println("Gjett: 1,2,4");

        System.out.println("Del 3");
        String s = "Test";
        for (int k = s.length() - 1; k > 0; k = k - 1) {
            System.out.println("Nr 3, k = " + s.charAt(k));
        }
        System.out.println("Gjett: s\n e\n t");

        System.out.println("Del 4");
        int tall = 7569;
        int hjelp = tall;
        int aS = 0;
        do {
            hjelp = hjelp / 10;
            aS = aS + 1;
        } while (hjelp > 0);
        System.out.println("Gjett: 4");
        System.out.println(tall + "  " + aS + " <fyll inn>");
    }
}