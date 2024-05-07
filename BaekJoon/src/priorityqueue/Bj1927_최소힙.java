package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bj1927_최소힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>((o1, o2) -> Long.compare(o1, o2));
        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(br.readLine());
            if (x == 0) {
                if (!pq.isEmpty()) {
                    sb.append(pq.poll()).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else {
                pq.add(x);
            }
        }
        System.out.println(sb);
    }
}
