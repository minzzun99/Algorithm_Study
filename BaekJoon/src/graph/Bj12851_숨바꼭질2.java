package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj12851_숨바꼭질2 {
    private static int N, K;
    private static int minSec = Integer.MAX_VALUE;
    private static int count = 0;
    private static int[] visited = new int[100001];

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(N);
        visited[N] = 1;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            if (minSec < visited[now]) {
                return;
            }

            for (int i = 0; i < 3; i++) {
                int next;
                if (i == 0) {
                    next = now - 1;
                } else if (i == 1) {
                    next = now + 1;
                } else {
                    next = now * 2;
                }

                if (next < 0 || next > 100000) {
                    continue;
                }
                if (next == K) {
                    minSec = visited[now];
                    count++;
                }
                // 첫 방문이거나 (time[next] == 0)
                // 이미 방문한 곳이어도 같은 시간에 방문했다면 (time[next] == time[now] + 1)
                // 경우의 수에 추가될 수 있기 때문에 Queue 에 한번 더 넣어줌
                if (visited[next] == 0 || visited[next] == visited[now] + 1) {
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

        if (N >= K) {
            System.out.println(N - K);
            System.out.println(1);
            return;
        }
        bfs();
        System.out.println(minSec);
        System.out.println(count);
    }
}
