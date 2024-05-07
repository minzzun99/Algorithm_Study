package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11053_LIS {
    private static int N;
    private static int[] arr;
    private static int[] dp;

    private static void LIS() {
        for (int i = 0; i < N; i++) {
            dp[i] = 1; // 자기 자신만으로 LIS의 길이는 최소 1이므로 초기값을 1로 설정
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1; // 이전 값보다 1 증가한 LIS의 길이로 갱신
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N];
        dp[0] = 1;
        LIS();
        int max = 0;
        for (int i : dp) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
