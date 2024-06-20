package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj14500_테트로미노 {
    private static int[][] map;
    private static int N, M;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    private static boolean[][] visited;
    private static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                backTracking(i, j, 1, map[i][j]);
                visited[i][j] = false;
            }
        }
        System.out.println(max);
    }

    private static void backTracking(int x, int y, int depth, int sum) {
        if (depth == 4) {
            max = Math.max(sum, max);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (!isPossible(nx, ny) || visited[nx][ny]) {
                continue;
            }

            if (depth == 2) {
                visited[nx][ny] = true;
                backTracking(x, y, depth + 1, sum + map[nx][ny]);
                visited[nx][ny] = false;
            }

            visited[nx][ny] = true;
            backTracking(nx, ny, depth + 1, sum + map[nx][ny]);
            visited[nx][ny] = false;
        }
    }

    private static boolean isPossible(int nx, int ny) {
        if (0 > nx || nx >= N || 0 > ny || ny >= M) {
            return false;
        } else {
            return true;
        }
    }
}
