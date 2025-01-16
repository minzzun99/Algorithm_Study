package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2491_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1;
        int count = 1;
        for (int i = 2; i <= N; i++) {
            if (arr[i - 1] <= arr[i]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        count = 1;
        for (int i = 2; i <= N; i++) {
            if (arr[i - 1] >= arr[i]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 1;
            }
        }

        System.out.println(max);
    }
}