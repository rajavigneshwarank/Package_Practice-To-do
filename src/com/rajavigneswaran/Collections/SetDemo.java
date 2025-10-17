package com.rajavigneswaran.Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(10, 20, 30, 40));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference: " + difference);

        System.out.println("Contains 20? " + set1.contains(20));
        System.out.println("Size of Set1: " + set1.size());
    }
}
