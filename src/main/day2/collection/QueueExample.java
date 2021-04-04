package main.day2.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        queue.add("Matthew");
        queue.add("Noel");

        System.out.println("Priority queue elements: " + queue);

        System.out.println("head using element: " + queue.element());
        System.out.println("head using peek: " + queue.peek());
        System.out.println("Iterating the queue elements: ");

        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        queue.remove("Noel");

        System.out.println("after removing three elements: ");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
