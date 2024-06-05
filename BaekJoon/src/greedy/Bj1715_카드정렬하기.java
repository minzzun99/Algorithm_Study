package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Bj1715_카드정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>(((o1, o2) -> Long.compare(o1, o2)));
        for (int i = 0; i < N; i++) {
            pq.add(Long.parseLong(br.readLine()));
        }
        long total = 0;
        while (!pq.isEmpty()) {
            if (pq.size() >= 2) {
                long sum = pq.poll() + pq.poll();
                total += sum;
                pq.add(sum);
            } else {
                break;
            }
        }
        System.out.println(total);
    }
}
