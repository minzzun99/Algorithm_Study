package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Bj10026_적록색약 {
    private static int n;
    private static char[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    static class Node{
        int x, y;
        char value;

        public Node(int x, int y, char value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            map[i] = str.toCharArray();
        }

        int normalCount = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                    normalCount++;
                }
            }
        }

        int colorBlindCount = 0;
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    bfs(i, j);
                    colorBlindCount++;
                }
            }
        }
        System.out.println(normalCount + " " + colorBlindCount);
    }

    private static void bfs(int x, int y) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(x, y, map[x][y]));
        visited[x][y] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (isPossible(nx, ny)) {
                    if (!visited[nx][ny] && map[nx][ny] == now.value) {
                        visited[nx][ny] = true;
                        deque.add(new Node(nx, ny, map[nx][ny]));
                    }
                }
            }
            if (map[now.x][now.y] == 'G') {
                map[now.x][now.y] = 'R';
            }
        }
    }

    private static boolean isPossible(int nx, int ny) {
        if (0 <= nx && nx < n && 0 <= ny && ny < n) {
            return true;
        } else {
            return false;
        }
    }
}
