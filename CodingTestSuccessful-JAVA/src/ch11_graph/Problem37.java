package ch11_graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem37 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int solution(int[][] maps) {
        int N = maps.length;
        int M = maps[0].length;
        int[][] dist = new int[N][M];

        Deque<Node> deque = new ArrayDeque<>();
        dist[0][0] = 1;
        deque.add(new Node(0, 0));
        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if (maps[nx][ny] == 0) {
                    continue;
                }
                if (dist[nx][ny] == 0) {
                    deque.add(new Node(nx, ny));
                    dist[nx][ny] = dist[now.x][now.y] + 1;
                }
            }
        }
        return dist[N - 1][M - 1] == 0 ? -1 : dist[N - 1][M - 1];
    }
}
