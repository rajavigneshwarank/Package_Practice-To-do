package com.rajavigneswaran.Collections;

import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(101, "Raj");
        table.put(102, "Vignesh");
        table.put(103, "Kumar");
        table.put(104, "Arun");

        System.out.println("Hashtable: " + table);
        System.out.println("Get key 102: " + table.get(102));
        System.out.println("Contains key 103? " + table.containsKey(103));
        System.out.println("Contains value 'Raj'? " + table.containsValue("Raj"));

        System.out.println("Keys: " + table.keys());
        System.out.println("Values: " + table.elements());

        table.remove(104);
        System.out.println("After Removing key 104: " + table);

        Hashtable<Integer, String> cloned = (Hashtable<Integer, String>) table.clone();
        System.out.println("Cloned Hashtable: " + cloned);
    }
}

