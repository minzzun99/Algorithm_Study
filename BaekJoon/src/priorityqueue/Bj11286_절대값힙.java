package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bj11286_절대값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            if (Math.abs(o1) == Math.abs(o2)) {
                return Integer.compare(o1, o2);
            } else {
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        });
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
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
    }
}
