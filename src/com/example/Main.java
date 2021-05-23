package com.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //testList();
        //testMap();
        //testSet();
        testCollections();
    }

    private static void testCollections() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, new Integer[]{64, 12, 135, 52});
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.sort(list);
        System.out.println(list);
    }

    private static void testList() {
        List<String> names = new ArrayList<>();
        names.add("Vít");
        names.add("Jana");
        names.add("Karel");
        names.add("Klára");
        names.add("Jana");

        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println(names.size());

        System.out.println(names.get(2));
        names.remove(1);
        System.out.println(names.get(2));
        System.out.println("Obsahuje Janu? "+  names.contains("Jana"));
    }

    private static void testMap() {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Vít");
        names.put(112, "Jana");
        names.put(5, "Karel");
        names.put(4, "Klára");
        names.put(5, "Jana");

        names.forEach( (key, name) -> {
            System.out.println(key + "->" +name);
        });

        System.out.println(names.size());

        System.out.println(names.get(1));
        names.remove(1);
        System.out.println(names.get(1));
        System.out.println("Obsahuje Janu? " +names.containsValue("Jana"));
    }

    private static void testSet() {
        Set<String> names = new HashSet<>();
        names.add("Vít");
        names.add("Jana");
        names.add("Karel");
        names.add("Klára");
        names.add("Jana");

        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> {
            System.out.println(name);
        });

        System.out.println(names.size());

        System.out.println(names.contains("Jana"));
        names.remove("Jana");
        System.out.println(names.contains("Jana"));
        System.out.println("Obsahuje Janu? "+  names.contains("Jana"));
    }

}
