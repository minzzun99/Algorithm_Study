package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj2161_카드1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (true) {
            int now = deque.poll();
            sb.append(now).append(' ');
            if (deque.isEmpty()) {
                break;
            }
            deque.addLast(deque.pollFirst());
        }
        System.out.println(sb);
    }
}
