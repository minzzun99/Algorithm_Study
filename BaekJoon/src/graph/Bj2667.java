package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Bj2667 {
    static int[][] arr;
    static int count;
    static int n;

    //이동 방향
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static void dfs(int x, int y) {
        arr[x][y] = 0;
        count += 1;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        // 배열에 저장
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count = 0;
                if (arr[i][j] == 1) {
                    dfs(i, j);
                    list.add(count);
                    sum++;
                }
            }
        }
        System.out.println(sum);
        Collections.sort(list);
        list.stream().mapToInt(Integer::intValue).forEach(System.out::println);
    }
}
