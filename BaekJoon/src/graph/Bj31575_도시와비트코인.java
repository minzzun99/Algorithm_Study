package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj31575_도시와비트코인 {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {1, 0};
    private static int[] dy = {0, 1};
    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (bfs()) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }

        System.out.println(sb);
    }

    private static boolean bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        visited = new boolean[N][M];
        deque.add(new Node(0, 0));
        visited[0][0] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 2; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == 1 && !visited[nx][ny]) {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

        return visited[N - 1][M - 1];
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
