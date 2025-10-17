package com.rajavigneswaran.Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Mango");

        System.out.println("all elements " + set);
        set.remove("Banana");

        System.out.println("after removing Banana: " + set);
        System.out.println("contains Mango? " + set.contains("Mango"));

        System.out.println("set size: " + set.size());
        System.out.println("is set empty? " + set.isEmpty());

        System.out.println("iterating through elements:");
        for (String s : set) {
            System.out.println(s);
        }

        set.clear();
        System.out.println("afer removing elements " + set);
    }
}
