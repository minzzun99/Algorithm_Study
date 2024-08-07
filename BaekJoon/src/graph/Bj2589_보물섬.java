package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2589_보물섬 {
    private static char[][] map;
    private static int N, M;
    private static int max = -1;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x;
        int y;
        int count;
        Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'L') {
                    bfs(new Node(i, j, 0));
                }
            }
        }
        System.out.println(max);
    }

    private static void bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][M];
        deque.add(start);
        visited[start.x][start.y] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            max = Math.max(max, now.count);

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny] && map[nx][ny] == 'L') {
                    deque.add(new Node(nx, ny, now.count + 1));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}