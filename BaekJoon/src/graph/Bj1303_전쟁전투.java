package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1303_전쟁전투 {
    private static int N, M;
    private static char[][] map;
    private static boolean[][] visited;
    private static int white, blue;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    bfs(new Node(i, j));
                }
            }
        }

        sb.append(white).append(" ").append(blue);
        System.out.println(sb);
    }

    private static void bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start.x][start.y] = true;
        char color = map[start.x][start.y];
        int count = 0;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == color) {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }

        if (color == 'B') {
            blue += (int) Math.pow(count, 2);
        } else {
            white += (int) Math.pow(count, 2);
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M && !visited[nx][ny];
    }

    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
