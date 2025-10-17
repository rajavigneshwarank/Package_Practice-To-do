package com.rajavigneswaran.Collections;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Mango");
        list.add("Apple");
        list.add("Orange");
        list.add("Grapes");

        System.out.println("all elements " + list);
        System.out.println("element at index 1: " + list.get(1));

        list.set(2, "pineapple");
        System.out.println("after changing index 2: " + list);

        list.remove("Grapes");
        System.out.println("after removing Grapes: " + list);

        System.out.println("contains Mango? " + list.contains("Mango"));
        System.out.println("list size: " + list.size());
        System.out.println("is list empty? " + list.isEmpty());

        System.out.println("iterating through list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
