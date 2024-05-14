package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj14940_쉬운최단거리 {
    private static int N, M;
    private static int[][] arr;
    private static boolean[][] visited;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];

        int x = 0;
        int y = 0;       // 시작 좌표

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) {
                    x = i;
                    y = j;
                }
            }
        }

        bfs(new Node(x, y, 0));

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && arr[i][j] != 0) {
                    arr[i][j] = -1;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs(Node start) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start.x][start.y] = true;
        arr[start.x][start.y] = start.count;

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int x = now.x + dx[i];
                int y = now.y + dy[i];
                if (isPossible(x, y) && !visited[x][y]) {
                    visited[x][y] = true;
                    arr[x][y] = now.count + 1;
                    deque.add(new Node(x, y, now.count + 1));
                }
            }
        }
    }

    private static boolean isPossible(int x, int y) {
        if (0 <= x && x < N && 0 <= y && y < M) {
            if (arr[x][y] != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
