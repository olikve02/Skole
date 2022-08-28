package com.skole.eksempel;

import java.util.concurrent.ThreadLocalRandom;

public class DoWhile {

    public static void main(String[] args) {
        int sum = 0;

        do {
            int terningkast = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("Terningkast: " + terningkast);
            sum = sum + terningkast;
            System.out.println("Sum: " + sum);
        } while (sum <= 100);
    }
}