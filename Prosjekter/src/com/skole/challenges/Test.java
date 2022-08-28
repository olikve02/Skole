package com.skole.challenges;

public class Test {
    int a = 0;

    public static void main(String[] args) {
        int k = 5;
        int sum = 0;
        int i = 0;

        do {
            sum = sum + k;
            k++;
            i++;
        } while (k < 5);
        System.out.println(i);
    }
}
