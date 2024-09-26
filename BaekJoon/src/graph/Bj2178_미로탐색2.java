package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2178_미로탐색2 {
    private static int N, M;
    private static int[][] map;
    private static int[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j + 1] = str.charAt(j) - '0';
            }
        }

        System.out.println(bfs(new Node(1, 1)));
    }

    private static int bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        visited = new int[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            Arrays.fill(visited[i], 0);
        }

        deque.add(start);
        visited[start.x][start.y] = 1;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == 1 && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[now.x][now.y] + 1;
                    deque.add(new Node(nx, ny));
                }
            }
        }

        return visited[N][M];
    }

    private static boolean isValid(int nx, int ny) {
        return 1 <= nx && nx <= N && 1 <= ny && ny <= M;
    }
}
