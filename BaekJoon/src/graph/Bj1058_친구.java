package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1058_친구 {
    private static int N;
    private static final int INF = 999999;
    private static int[][] cost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cost = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    continue;
                }
                cost[i][j] = chars[j - 1] == 'Y' ? 1 : INF;
            }
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == j) {
                        continue;
                    }

                    cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
                }
            }
        }

        int max = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (cost[i][j] == 1 || cost[i][j] == 2) {
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        System.out.println(max);
    }
}
