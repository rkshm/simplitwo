package main.day2.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        //key cannot have duplicates but value can
        //Interview: We can have single null key but we can have multiple null values
        //item with null key is at the top / first

        hashMap.put("1", "1");
        hashMap.put("2", "SECOND");
        hashMap.put("3", "THIRD");
        hashMap.put("4", null);
        hashMap.put(null, "FIFTH");

        System.out.println("HashMap is: " + hashMap);
        System.out.println("Value with key as 3: " + hashMap.get("3"));
        System.out.println("Is HashMap is empty?: " + hashMap.isEmpty());

        hashMap.remove("2");
        System.out.println("After removal, the HashMap is: " + hashMap);
        System.out.println("Size of the HashMap is: " + hashMap.size());

        System.out.println("HashMap contains value FIFTH check: " + hashMap.containsValue("FIFTH"));
        System.out.println("HashMap contains key 3 check: " + hashMap.containsValue("3"));

        System.out.println("====================================");

        HashMap<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(1, "1");
        hashMap1.put(2, "SECOND");
        hashMap1.put(3, "THIRD");
        hashMap1.put(4, null);
        hashMap1.put(null, "FIFTH");

        System.out.println("HashMap is: " + hashMap1);
        System.out.println("Value with key as 3: " + hashMap1.get(3));
        System.out.println("Is HashMap is empty?: " + hashMap1.isEmpty());

        hashMap1.remove(2);
        System.out.println("After removal, the HashMap is: " + hashMap1);
        System.out.println("Size of the HashMap is: " + hashMap1.size());

        System.out.println("HashMap contains value FIFTH check: " + hashMap1.containsValue("FIFTH"));
        System.out.println("HashMap contains key 3 check: " + hashMap1.containsValue(3));

    }
}
