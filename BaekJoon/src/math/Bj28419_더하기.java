package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28419_더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long odd = 0;
        long even = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i % 2 == 0) {
                odd += arr[i];
            } else {
                even += arr[i];
            }
        }

        if (N == 3 && odd > even) {
            System.out.println(-1);
        } else {
            System.out.println(Math.abs(odd - even));
        }
    }
}
