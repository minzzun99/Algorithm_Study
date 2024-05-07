package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        sb.append("<");
        while (deque.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            sb.append(deque.pollFirst() + ", ");
        }
        sb.append(deque.pollLast() + ">");
        System.out.println(sb);
    }
}
