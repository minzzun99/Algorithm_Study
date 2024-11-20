package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj17070_파이프옮기기1 {
    private static int count;
    private static int[][] map;
    private static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 1, 0);
        System.out.println(count);
    }

    private static void dfs(int row, int col, int dir) {
        // 0 : 가로 / 1 : 세로 / 2 : 대각
        if (row == N - 1 && col == N - 1) {
            count++;
            return;
        }

        if (dir == 0) {
            if (col + 1 < N && map[row][col + 1] == 0) {
                dfs(row, col + 1, 0);
            }
        } else if (dir == 1) {
            if (row + 1 < N && map[row + 1][col] == 0) {
                dfs(row + 1, col, 1);
            }
        } else {
            if (col + 1 < N && map[row][col + 1] == 0) {
                dfs(row, col + 1, 0);
            }
            if (row + 1 < N && map[row + 1][col] == 0) {
                dfs(row + 1, col, 1);
            }
        }

        if (checkDiagonal(row, col)) {
            dfs(row + 1, col + 1, 2);
        }
    }

    private static boolean checkDiagonal(int row, int col) {
        return row + 1 < N && col + 1 < N && map[row + 1][col + 1] == 0 && map[row + 1][col] == 0
                && map[row][col + 1] == 0;
    }
}
