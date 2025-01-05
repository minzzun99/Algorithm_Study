package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2110_공유기설치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int lo = 1;
        int hi = arr[N - 1] - arr[0] + 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            int idx = 0;
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (arr[i] - arr[idx] >= mid) {
                    idx = i;
                    count++;
                }
            }

            if (count < C) {
                hi = mid;
                continue;
            }

            lo = mid + 1;
        }

        System.out.println(lo - 1);
    }
}
