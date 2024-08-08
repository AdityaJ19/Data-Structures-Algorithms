package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        //because there is no class queue only interface
        //instead we can use linkedlist as it also
        //provides all the functions that queue performs
        Queue<Integer> queue = new LinkedList<>();

        queue.add(23);
        queue.add(34);
        queue.add(43);
        queue.add(32);
        queue.add(12);

        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
