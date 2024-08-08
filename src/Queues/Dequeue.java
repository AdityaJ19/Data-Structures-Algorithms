package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        //used to create object
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(23);
        deque.add(12);
        deque.add(32);
        deque.add(34);
        deque.addFirst(12);
        deque.addLast(54);
        System.out.println(deque);

    }
}
