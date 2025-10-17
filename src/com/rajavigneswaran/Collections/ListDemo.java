package com.rajavigneswaran.Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Grapes");

        System.out.println("Original List: " + fruits);
        fruits.remove("Banana");
        fruits.set(2, "Pineapple");

        System.out.println("After Modifications: " + fruits);
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Index of Orange: " + fruits.indexOf("Orange"));

        fruits.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + fruits);

        fruits.replaceAll(f -> f.toUpperCase());
        System.out.println("Uppercase List: " + fruits);

        System.out.println("Using forEach:");
        fruits.forEach(System.out::println);
    }
}
