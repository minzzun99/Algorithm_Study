package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1182_부분수열의합 {
    private static int N, S;
    private static int count;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        count = 0;

        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sumSub(0, 0);
        if (S == 0) {
            count--;
        }
        System.out.println(count);
    }

    private static void sumSub(int depth, int sum) {
        if (depth == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        sumSub(depth + 1, sum + arr[depth]);        // 원소를 포함하는 경우
        sumSub(depth + 1, sum);                 // 원소를 포함하지 않는 경우
    }
}
