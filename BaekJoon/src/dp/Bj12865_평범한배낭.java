package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj12865_평범한배낭 {
    private static class luggage {
        int w;
        int v;

        public luggage(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        luggage[] arr = new luggage[N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr[i] = new luggage(w, v);
        }

        int[][] dp = new int[N + 1][K + 1];

        for (int k = 1; k <= K; k++) {
            for (int i = 1; i <= N; i++) {
                dp[i][k] = dp[i - 1][k];
                if (k - arr[i].w >= 0) {
                    dp[i][k] = Math.max(dp[i - 1][k], arr[i].v + dp[i - 1][k - arr[i].w]);
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
