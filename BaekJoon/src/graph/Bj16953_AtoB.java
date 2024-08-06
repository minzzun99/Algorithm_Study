package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj16953_AtoB {
    private static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        System.out.println(bfs(A, B));
    }

    private static int bfs(long start, long end) {
        Deque<Long> deque = new ArrayDeque<>();
        deque.add(start);
        count = 0;

        while (!deque.isEmpty()) {
            int size = deque.size();

            for (int i = 0; i < size; i++) {
                long now = deque.poll();
                if (now == end) {
                    return count + 1;
                }
                if (now * 2 <= end) {
                    deque.add(now * 2);
                }
                if (now * 10 + 1 <= end) {
                    deque.add(now * 10 + 1);
                }
            }
            count++;
        }
        return -1;
    }
}
