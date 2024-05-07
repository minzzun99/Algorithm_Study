package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1012 {
    static int[][] field;
    static int n, m;
    //가로 세로 한칸씩 이동할 수 있는 경우의 수
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static void dfs(int x, int y) {
        field[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < m && ny >= 0 && ny < n && field[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            m = Integer.parseInt(st.nextToken());       // 가로 길이
            n = Integer.parseInt(st.nextToken());       // 세로 길이
            int k = Integer.parseInt(st.nextToken());       // 배추 위치 개수
            // 밭 배열 생성
            field = new int[m][n];

            // 배추 위치 초기화
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }

            //배추흰지렁이의 수
            int sum = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (field[i][j] == 1) {
                        dfs(i, j);
                        sum++;
                    }
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
