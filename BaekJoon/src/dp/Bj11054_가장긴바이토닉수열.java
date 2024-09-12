package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11054_가장긴바이토닉수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] leftDP = new int[N];
        int[] rightDP = new int[N];

        // 왼 -> 오 dp 배열
        for (int i = 0; i < N; i++) {
            leftDP[i] = 1;
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i] && leftDP[i] < leftDP[j] + 1) {
                    leftDP[i] = leftDP[j] + 1;
                }
            }
        }

        // 오 -> 왼 dp 배열
        for (int i = N - 1; i >= 0; i--) {
            rightDP[i] = 1;
            for (int j = N - 1; j > i; j--) {
                if(arr[j] < arr[i] && rightDP[i] < rightDP[j] + 1) {
                    rightDP[i] = rightDP[j] + 1;
                }
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, leftDP[i] + rightDP[i] - 1);
        }
        System.out.println(max);
    }
}
