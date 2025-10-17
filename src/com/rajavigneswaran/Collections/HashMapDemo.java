package com.rajavigneswaran.Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.putIfAbsent(4, "Go");
        map.put(5, "Rust");

        System.out.println("Initial Map: " + map);
        map.replace(3, "C#");
        map.remove(5);

        System.out.println("After Modifications: " + map);
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        map.computeIfPresent(2, (k, v) -> v + " Language");
        map.merge(6, "Swift", (oldV, newV) -> oldV + "," + newV);
        System.out.println("After computeIfPresent & merge: " + map);

        System.out.println("Iterating using forEach:");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

