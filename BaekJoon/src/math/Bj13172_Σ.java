package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13172_Σ {
    private static final int MOD = 1_000_000_007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int M = Integer.parseInt(br.readLine());

        long sum = 0;
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            long N = Long.parseLong(st.nextToken());
            long S = Long.parseLong(st.nextToken());
            long gcd = gcd(N, S);
            N /= gcd;
            S /= gcd;

            sum += S * mod(N, MOD - 2) % MOD;       // 페르마 소정리 1/N == N ^ MOD - 2
            sum %= MOD;
        }

        System.out.println(sum);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    private static long mod(long N, long idx) {
        if (idx == 1) {
            return N;
        }
        long p = mod(N, idx / 2);       // 분할정복
        long result = p * p % MOD;
        if (idx % 2 == 1) {
            result = result * N % MOD;      // 홀수일 경우 한 번 더 계산
        }

        return result;
    }
}
