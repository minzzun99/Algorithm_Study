package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj14502_연구소 {
    private static int N, M;
    private static int[][] map;
    private static int[][] virusMap;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static int safeArea = Integer.MIN_VALUE;

    public static class Node {
        int y;
        int x;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
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
        dfs(0);
        System.out.println(safeArea);
    }

    // 벽 세우기
    private static void dfs(int wall) {
        if (wall == 3) {
            bfs();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    dfs(wall + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    // 안전지대 범위 확인하기
    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<>();
        virusMap = new int[N][M];
        for (int i = 0; i < N; i++) {
            virusMap[i] = map[i].clone();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 2) {
                    deque.add(new Node(i, j));
                }
            }
        }

        while (!deque.isEmpty()) {
            Node now = deque.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (virusMap[nx][ny] == 0) {
                        virusMap[nx][ny] = 2;
                        deque.add(new Node(nx, ny));
                    }
                }
            }
        }

        count(virusMap);
    }

    private static void count(int[][] virusMap) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 0) {
                    count++;
                }
            }
        }
        safeArea = Math.max(count, safeArea);
    }
}
