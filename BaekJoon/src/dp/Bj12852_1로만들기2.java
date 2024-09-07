package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj12852_1로만들기2 {
    private static class Num {
        int count;
        String result;

        Num(int count, String result) {
            this.count = count;
            this.result = result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Num[] dp = new Num[N + 1];
        dp[1] = new Num(0, "1");

        for (int i = 2; i <= N; i++) {
            int count = Integer.MAX_VALUE;
            int prev = 0;

            if (i % 3 == 0 && dp[i / 3].count < count) {
                count = dp[i / 3].count;
                prev = i / 3;
            }

            if (i % 2 == 0 && dp[i / 2].count < count) {
                count = dp[i / 2].count;
                prev = i / 2;
            }


            if (count > dp[i - 1].count) {
                prev = i - 1;
            }

            dp[i] = new Num(dp[prev].count + 1, i + " " + dp[prev].result);
        }

        sb.append(dp[N].count).append('\n');
        sb.append(dp[N].result);
        System.out.println(sb);
    }
}
