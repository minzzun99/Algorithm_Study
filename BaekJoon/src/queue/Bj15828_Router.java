package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj15828_Router {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == -1) {
                break;
            }

            if (input == 0 && !deque.isEmpty()) {
                deque.pollFirst();
                continue;
            }

            if (deque.size() < N) {
                deque.addLast(input);
            }
        }

        if (deque.isEmpty()) {
            System.out.println("empty");
        } else {
            while (!deque.isEmpty()) {
                sb.append(deque.pollFirst()).append(' ');
            }
            System.out.println(sb);
        }
    }
}
