package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2090_조화평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            sb.append(arr[0]).append('/').append(1);
            System.out.println(sb);
            return;
        }

        long lcm = arr[0];
        long sum = 0;
        for (int i = 1; i < N; i++) {
            lcm = lcm * arr[i] / gcd(arr[i], lcm);
        }
        for (int i = 0; i < N; i++) {
            sum += lcm / arr[i];
        }
        long sumGCD = gcd(lcm, sum);
        sb.append(lcm / sumGCD).append('/').append(sum / sumGCD);
        System.out.println(sb);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
