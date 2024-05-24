package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj2583_영역구하기 {
    private static int[][] arr;
    private static int N, M;
    private static int count;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());       // Y축
        M = Integer.parseInt(st.nextToken());       // X축
        int K = Integer.parseInt(st.nextToken());       // 직사각형의 개수
        arr = new int[M][N];

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    arr[x][y] = 1;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0) {
                    count = 0;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        sb.append(result.size()).append('\n');
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i)).append(' ');
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        arr[x][y] = 1;
        count++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (isPossible(nx, ny)) {
                if (arr[nx][ny] == 0) {
                    dfs(nx, ny);
                }
            }
        }
    }

    private static boolean isPossible(int nx, int ny) {
        if (0 <= nx && nx < M && 0 <= ny && ny < N) {
            return true;
        } else {
            return false;
        }
    }
}
