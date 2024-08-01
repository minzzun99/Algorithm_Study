package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj2468_안전영역 {
    private static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int[][] map;
    private static boolean[][] visited;
    private static int N;
    private static int maxCount = 0;
    private static int maxHeight = 0;
    private static int minHeight = 101;

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, map[i][j]);
                minHeight = Math.min(minHeight, map[i][j]);
            }
        }

        for (int h = minHeight - 1; h <= maxHeight; h++) {      // 비가 안오는 경우도 생각
            int area = 0;
            visited = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] > h && !visited[i][j]) {
                        bfs(h, new Node(i, j));
                        area++;
                    }
                }
            }
            maxCount = Math.max(maxCount, area);
        }

        System.out.println(maxCount);
    }

    private static void bfs(int h, Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start.x][start.y] = true;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (isValid(nx, ny) && map[nx][ny] > h) {
                    deque.add(new Node(nx, ny));
                    visited[nx][ny] = true;
                }
            }
        }
    }

    private static boolean isValid(int nx, int ny) {
        return 0 <= nx && nx < N && 0 <= ny && ny < N && !visited[nx][ny];
    }
}
