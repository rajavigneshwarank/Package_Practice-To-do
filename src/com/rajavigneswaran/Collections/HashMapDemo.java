package com.rajavigneswaran.Collections;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
                HashMap<Integer, String> map = new HashMap<>();
                map.put(1, "Apple");
                map.put(2, "Banana");
                map.put(3, "Cherry");
                map.put(4, "Mango");

                System.out.println("all elements in map " + map);

                System.out.println("value for key 2 : " + map.get(2));

                map.remove(3);
                System.out.println("after removing key 3: " + map);

                System.out.println("contains key 4? " + map.containsKey(4));
                System.out.println("contains value 'Apple'? " + map.containsValue("Apple"));

                System.out.println("all keys: " + map.keySet());
                System.out.println("all values: " + map.values());
                System.out.println("all entries: " + map.entrySet());
            }
        }


