package ch7_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem15 {
    private int solution(int N, int K) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        while (deque.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                deque.add(deque.poll());
            }
            deque.poll();
        }

        return deque.poll();
    }
}
