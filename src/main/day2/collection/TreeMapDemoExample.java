package main.day2.collection;

import java.util.TreeMap;

public class TreeMapDemoExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Student1", 120);
        marks.put("Student5", 99);
        marks.put("Student6", 130);
        marks.put("Student2", 190);
        marks.put("Student3", 89);
        marks.put("Student4", 142);

        //Iterator cannot be used for Map. Use for loop over keySet

        for(String key: marks.keySet()) {
            System.out.println(key + ": " + marks.get(key));
        }

        System.out.println("TreeMap is sorted by default by key");

        System.out.println("====================================");

    }
}
