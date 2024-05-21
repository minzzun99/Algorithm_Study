package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2485_가로수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] interval = new int[N - 1];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N - 1; i++) {
            interval[i] = arr[i + 1] - arr[i];
        }
        int itv = interval[0];
        for (int i = 1; i < interval.length; i++) {
            itv = gcd(itv, interval[i]);
        }
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            sum += (interval[i] / itv) - 1;
        }
        System.out.println(sum);
    }

    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
