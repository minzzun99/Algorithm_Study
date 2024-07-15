package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2156_포도주시식 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] wine = new int[N];
        for (int i = 0; i < N; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[N];
        dp[0] = wine[0];

        for (int i = 1; i < N; i++) {
            if (i == 1) {
                dp[1] = dp[0] + wine[1];
                continue;
            }
            if (i == 2) {
                dp[2] = Math.max(dp[1], Math.max(wine[0] + wine[2], wine[1] + wine[2]));
                continue;
            }
            dp[i] = Math.max(dp[i - 1], Math.max(dp[i - 2] + wine[i], dp[i - 3] + wine[i - 1] + wine[i]));
        }
        System.out.println(dp[N - 1]);
    }
}
