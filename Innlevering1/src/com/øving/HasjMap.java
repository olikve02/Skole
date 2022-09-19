package com.øving;
import java.util.HashMap;
public class HasjMap {
    public static void main(String[] args) {
        HashMap<String, String> personer = new HashMap<>();

        personer.put("Oliver", "0.4");
        personer.put("Daniel", "0.8");
        personer.put("Ruben", "1.8");

        System.out.println(personer.get("Ruben"));

    }
}
