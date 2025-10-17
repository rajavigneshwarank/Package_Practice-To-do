package com.rajavigneswaran.Collections;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Raj");
        table.put(2, "Kumar");
        table.put(3, "Vignesh");
        table.put(4, "Arun");

        System.out.println("all elements: " + table);

        System.out.println("value for key 2: " + table.get(2));

        table.remove(3);
        System.out.println("after removing key 3: " + table);

        System.out.println("contains key 4? " + table.containsKey(4));
        System.out.println("contains value 'Raj'? " + table.containsValue("Raj"));

        System.out.println("all keys: " + table.keys());
        System.out.println("all values: " + table.elements());
    }
}

