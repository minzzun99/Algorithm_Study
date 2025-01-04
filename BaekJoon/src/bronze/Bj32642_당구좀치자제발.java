package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj32642_당구좀치자제발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long[] score = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            if (arr[i] == 1) {
                score[i] = score[i - 1] + 1;
            } else {
                score[i] = score[i - 1] - 1;
            }
        }

        long sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += score[i];
        }

        System.out.println(sum);
    }
}
