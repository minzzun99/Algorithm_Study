package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9251_LCS_2번째 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch1 = br.readLine().toCharArray();
        char[] ch2 = br.readLine().toCharArray();
        int N = ch1.length;
        int M = ch2.length;

        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (ch1[i - 1] == ch2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[N][M]);
    }
}
