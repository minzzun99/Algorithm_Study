package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj17086_아기상어2 {
    private static int[][] map;
    private static int N, M;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0, 1, 1, -1, -1};
    private static int[] dy = {0, 0, -1 , 1, 1, -1, 1, -1};
    

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
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    result = Math.max(result, bfs(new Node(i, j, 0)));
                }
            }
        }

        System.out.println(result);
    }

    private static int bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        visited = new boolean[N][M];
        deque.add(start);
        visited[start.x][start.y] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (int i = 0; i < 8; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && !visited[nx][ny]) {
                    if (map[nx][ny] == 0) {
                        deque.add(new Node(nx, ny, now.count + 1));
                        visited[nx][ny] = true;
                    } else {
                        return now.count + 1;
                    }
                }
            }
        }

        return -1;
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M;
    }
}
