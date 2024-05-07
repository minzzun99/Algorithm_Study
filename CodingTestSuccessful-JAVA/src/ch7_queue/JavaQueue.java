package ch7_queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int first = queue.poll();
        System.out.println(first);

        queue.add(4);
        queue.add(5);

        first = queue.poll();
        System.out.println(first);

        System.out.println("----------------");
        System.out.println("Deque 사용");

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        int firstDeque = deque.pollFirst();
        System.out.println(firstDeque);

        deque.addLast(4);
        deque.addLast(5);

        firstDeque = deque.pollFirst();
        System.out.println(firstDeque);
    }
}
