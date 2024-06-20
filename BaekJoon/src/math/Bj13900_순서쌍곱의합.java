package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13900_순서쌍곱의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long sum = 0;
        arr[0] = Long.parseLong(st.nextToken());
        for (int i = 1; i < N; i++) {
            long num = Long.parseLong(st.nextToken());
            arr[i] = num + arr[i - 1];
            sum += arr[i - 1] * num;
        }

        System.out.println(sum);
    }
}