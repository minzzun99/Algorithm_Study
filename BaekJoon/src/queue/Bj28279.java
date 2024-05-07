package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                deque.addFirst(x);
            } else if (command == 2) {
                int x = Integer.parseInt(st.nextToken());
                deque.addLast(x);
            } else if (command == 3) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollFirst()).append('\n');
                }
            } else if (command == 4) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.pollLast()).append('\n');
                }
            } else if (command == 5) {
                sb.append(deque.size()).append('\n');
            } else if (command == 6) {
                if (deque.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else if (command == 7) {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekFirst()).append('\n');
                }
            } else {
                if (deque.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
