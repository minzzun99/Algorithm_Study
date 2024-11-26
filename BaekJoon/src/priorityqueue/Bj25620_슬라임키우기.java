package priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj25620_슬라임키우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        int zeroCount = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            long number = Long.parseLong(st.nextToken());
            if (number == 0) {
                zeroCount++;
            } else {
                pq.add(number);
            }
        }

        while (Q-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            if (y == 1) {
                continue;
            }

            if (y == 0) {
                while (!pq.isEmpty() && pq.peek() <= x) {
                    pq.poll();
                    zeroCount++;
                }
            } else {
                PriorityQueue<Long> temp = new PriorityQueue<>();
                while (!pq.isEmpty() && pq.peek() <= x) {
                    long now = pq.poll();
                    long result = now * y;

                    temp.add(result);
                }

                pq.addAll(temp);
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            sb.append(0).append(' ');
        }

        while (!pq.isEmpty()) {
            sb.append(pq.poll()).append(' ');
        }

        System.out.println(sb);
    }
}