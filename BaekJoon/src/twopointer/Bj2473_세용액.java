package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2473_세용액 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        long min = Long.MAX_VALUE;
        long[] result = new long[3];

        for (int i = 0; i < N - 2; i++) {
            int start = i;
            int mid = i + 1;
            int end = N - 1;

            while (mid < end) {
                long sum = arr[start] + arr[mid] + arr[end];

                if (Math.abs(sum) < min) {
                    min = Math.abs(sum);
                    result[0] = arr[start];
                    result[1] = arr[mid];
                    result[2] = arr[end];
                }

                if (sum == 0) {
                    break;
                } else if (sum > 0) {
                    end--;
                } else {
                    mid++;
                }
            }
        }

        sb.append(result[0]).append(" ").append(result[1]).append(" ").append(result[2]);
        System.out.println(sb);
    }
}
