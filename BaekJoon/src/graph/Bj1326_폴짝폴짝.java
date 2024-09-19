package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1326_폴짝폴짝 {
    private static int N, A, B;
    private static int[] bridge;
    private static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        bridge = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        bfs();

        System.out.println(visited[B]);
    }

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        visited = new int[N + 1];
        Arrays.fill(visited, -1);
        visited[A] = 0;
        deque.add(A);

        while (!deque.isEmpty()) {
            int now = deque.poll();
            if (now == B) {
                break;
            }

            for (int i = 1; ; i++) {
                int frontNext = now + (bridge[now] * i);
                int backNext = now - (bridge[now] * i);
                if (frontNext > N && backNext <= 0) {
                    break;
                }

                if (frontNext <= N && visited[frontNext] == -1) {
                    deque.add(frontNext);
                    visited[frontNext] = visited[now] + 1;
                }

                if (backNext > 0 && visited[backNext] == -1) {
                    deque.add(backNext);
                    visited[backNext] = visited[now] + 1;
                }
            }
        }
    }
}
