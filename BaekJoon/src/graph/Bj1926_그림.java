package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj1926_그림 {
    private static int N, M;
    private static int maxArea ;
    private static int count;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int bfs(Node node) {
        Deque<Node> deque = new ArrayDeque<>();
        int sum = 0;
        deque.add(node);
        visited[node.x][node.y] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            sum++;

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (!isValid(nx, ny) && map[nx][ny] == 1) {     // 인덱스가 유효한지부터 검사해야함
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
        return sum;
    }

    private static boolean isValid(int x, int y) {
        return 0 > x || x >= N || 0 > y || y >= M || visited[x][y];
        /*return 0 <= x && x < N && 0 <= y && y < M && !visited[x][y];*/
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new boolean[N][M];
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    int sum = bfs(new Node(i, j));
                    count++;
                    maxArea = Math.max(sum, maxArea);
                }
            }
        }

        sb.append(count).append('\n');
        sb.append(maxArea);
        System.out.println(sb);
    }
}
