package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1003_피보나치함수 {
    private static int[][] dp = new int[2][41];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dp[0][0] = 1;
        dp[1][0] = 0;

        dp[0][1] = 0;
        dp[1][1] = 1;

        for (int i = 2; i <= 40; i++) {
            if (dp[0][i] == 0) {
                dp[0][i] = dp[0][i - 1] + dp[0][i - 2];
                dp[1][i] = dp[1][i - 1] + dp[1][i - 2];
            }
        }

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[0][n]).append(' ').append(dp[1][n]).append('\n');
        }
        System.out.println(sb);
    }
}
