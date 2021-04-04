package main.day2.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet();
        hs.add("Hello");
        hs.add("Bye");
        hs.add("Bus");
        hs.add("Blue");
        hs.add("Blie");
        hs.add("Hello");
        hs.add("Blue");

        LinkedHashSet<String> country = new LinkedHashSet<>();
        country.add("India");
        country.add("Australia");
        country.add("US");
        country.add("Canada");
        country.add("Nepal");
        country.add("England");
        country.add("Bermuda");

        TreeSet<String> ts = new TreeSet<>();
        ts.add("d");
        ts.add("c");
        ts.add("b");
        ts.add("a");
        ts.add("c");
        ts.add("i");
        ts.add("l");


        System.out.println("TreeSet is " + ts);
        System.out.println("HashSet is " + hs);
        System.out.println("LinkedHashSet is " + country);

        System.out.println("Size of HashSet is " + hs.size());

        System.out.println("Does HashSet contain 'u' element: " + hs.contains("u"));
        System.out.println("Is HashSet empty " + hs.isEmpty());
        System.out.println("Remove the element " + hs.remove("i"));


        System.out.println("TreeSet is: " + ts);
        ts.clear();
        System.out.println("TreeSet is: " + ts);
        System.out.println("TreeSet get class: " + ts.getClass());

        System.out.println("Is TreeSet empty: " + hs.isEmpty());

    }

}
