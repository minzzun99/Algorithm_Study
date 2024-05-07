package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1697_숨바꼭질 {
    private static int N, K;
    private static int[] visited = new int[100001];

    private static void bfs(int n) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(n);
        visited[n] = 1;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = now - 1;
                } else if (i == 1) {
                    next = now + 1;
                } else {
                    next = now * 2;
                }

                if (next == K) {
                    System.out.println(visited[now]);
                    return;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    deque.add(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }
}
