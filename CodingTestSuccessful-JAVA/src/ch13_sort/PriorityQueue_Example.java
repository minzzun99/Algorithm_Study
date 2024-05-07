package ch13_sort;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Example {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
