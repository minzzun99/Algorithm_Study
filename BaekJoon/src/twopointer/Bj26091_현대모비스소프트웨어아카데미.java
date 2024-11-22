package twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj26091_현대모비스소프트웨어아카데미 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        if (N == 1) {
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);
        int left = 0;
        int right = N - 1;
        int count = 0;
        while (left < right) {
            long sum = arr[left] + arr[right];
            if (sum >= M) {
                count++;
                left++;
                right--;
            } else {
                left++;
            }
        }

        System.out.println(count);
    }
}
