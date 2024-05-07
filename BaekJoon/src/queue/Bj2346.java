package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {         //종이 저장
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        sb.append(deque.pollFirst()).append(" ");   // 1번은 먼저 터트림
        int index = arr[0];     // 1번 풍선 쪽지
        while (!deque.isEmpty()) {
            if (index > 0) {
                for (int i = 1; i < index; i++) {
                    deque.addLast(deque.pollFirst());
                }
                index = arr[deque.peekFirst() - 1];
                sb.append(deque.pollFirst()).append(" ");
            } else {
                for (int i = 1; i < -index; i++) {
                    deque.addFirst(deque.pollLast());
                }
                index = arr[deque.peekLast() - 1];
                sb.append(deque.pollLast()).append(" ");
            }
        }
        System.out.println(sb);
    }
}
