package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Bj4150_피보나치수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            sb.append(0);
        } else if (N == 1){
            sb.append(1);
        } else {
            BigInteger[] dp = new BigInteger[N + 1];
            dp[0] = BigInteger.ZERO;
            dp[1] = BigInteger.ONE;
            for (int i = 2; i <= N; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }
            sb.append(dp[N]);
        }
        System.out.println(sb);
    }
}
