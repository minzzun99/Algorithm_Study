package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bj1417_국회의원선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(((o1, o2) -> {
            return Integer.compare(o2, o1);
        }));

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        while (!pq.isEmpty()) {
            int now = pq.poll();
            if (now < d) {
                break;
            } else {
                now--;
                d++;
                count++;
                pq.add(now);
            }
        }

        System.out.println(count);
    }
}
