package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj16928_뱀과사다리게임 {
    private static int[] map = new int[101];
    private static int[] visited = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 1; i < map.length; i++) {
            map[i] = i;
        }

        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x] = y;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            map[u] = v;
        }
        bfs();
        System.out.println(visited[100]);
    }

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        Arrays.fill(visited, - 1);
        deque.add(1);
        visited[1] = 0;

        while (!deque.isEmpty()) {
            int now = deque.poll();

            if (now == 100) {
                break;
            }
            for (int i = 1; i <= 6; i++) {
                int next = now + i;
                if (isValid(next)) {
                    if (visited[map[next]] == -1) {
                        deque.add(map[next]);
                        visited[map[next]] = visited[now] + 1;
                    }
                }
            }
        }
    }

    private static boolean isValid(int next) {
        return 1 <= next && next <= 100;
    }
}
