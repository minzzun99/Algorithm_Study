package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj13913_숨바꼭질4 {
    private static int N, M;
    private static boolean[] visited;
    private static int[] parent;
    private static int max = 100000;
    private static int minSec = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        bfs();
        sb.append(minSec).append('\n');
        printPath(sb);
        System.out.println(sb);
    }

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        visited = new boolean[100001];
        parent = new int[100001];
        deque.add(N);
        visited[N] = true;
        parent[N] = -1;

        int[] second = new int[100001];

        while (!deque.isEmpty()) {
            int now = deque.poll();

            if (now == M) {
                minSec = second[now];
                return;
            }

            if (now * 2 <= max && !visited[now * 2]) {
                deque.add(now * 2);
                visited[now * 2] = true;
                parent[now * 2] = now;
                second[now * 2] = second[now] + 1;
            }
            if (now + 1 <= max && !visited[now + 1]) {
                deque.add(now + 1);
                visited[now + 1] = true;
                parent[now + 1] = now;
                second[now + 1] = second[now] + 1;
            }
            if (now - 1 >= 0 && !visited[now - 1]) {
                deque.add(now - 1);
                visited[now - 1] = true;
                parent[now - 1] = now;
                second[now - 1] = second[now] + 1;
            }
        }
    }

    private static void printPath(StringBuilder sb) {
        Deque<Integer> path = new ArrayDeque<>();
        for (int i = M; i != -1; i = parent[i]) {
            path.add(i);
        }
        while (!path.isEmpty()) {
            sb.append(path.pollLast()).append(" ");
        }
    }
}
