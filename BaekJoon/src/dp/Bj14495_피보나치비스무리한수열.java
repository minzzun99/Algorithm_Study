package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14495_피보나치비스무리한수열 {
    private static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp = new long[117];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;

        int N = Integer.parseInt(br.readLine());
        if (N < 4) {
            System.out.println(1);
        } else {
            for (int i = 4; i <= N; i++) {
                dp[i] = dp[i - 1] + dp[i - 3];
            }
            System.out.println(dp[N]);
        }
    }
}
