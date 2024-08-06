package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1743_음식물피하기_BFS {
    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int N, M, K;
    private static int max;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];


        while (K-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            map[x - 1][y - 1] = 1;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1) {
                    int count = bfs(new Node(i, j));
                    max = Math.max(max, count);
                }
            }
        }
        System.out.println(max);
    }

    private static int bfs(Node node) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(node);
        visited[node.x][node.y] = true;
        int count = 1;
        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == 1) {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < M && !visited[nx][ny];
    }
}
