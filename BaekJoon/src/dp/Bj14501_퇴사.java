package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14501_퇴사 {
    private static class Counsel {
        int time;
        int pay;

        Counsel(int time, int pay) {
            this.time = time;
            this.pay = pay;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Counsel[] counselArr = new Counsel[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            counselArr[i] = new Counsel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int[] dp = new int[N + 1];
        for (int i = 0; i < N; i++) {
            if (i + counselArr[i].time <= N) {
                dp[i + counselArr[i].time] = Math.max(dp[i + counselArr[i].time], dp[i] + counselArr[i].pay);
            }
            dp[i + 1] = Math.max(dp[i], dp[i + 1]);
        }
        System.out.println(dp[N]);
    }
}
