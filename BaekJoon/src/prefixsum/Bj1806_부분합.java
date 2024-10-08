package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1806_부분합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        while (start <= N && end <= N) {
            if (sum >= S && min > end - start) {
                min = end - start;
            }

            if (sum < S) {
                sum += arr[end++];
            } else {
                sum -= arr[start++];
            }
        }

        if (min == Integer.MAX_VALUE) {
            sb.append(0);
        } else {
            sb.append(min);
        }

        System.out.println(sb);
    }
}
