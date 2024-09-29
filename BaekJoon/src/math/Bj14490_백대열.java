package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj14490_백대열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int gcd = gcd(N, M);
        sb.append(N / gcd).append(":").append(M / gcd);
        System.out.println(sb);
    }

    private static int gcd(int N, int M) {
        if (N % M == 0) {
            return M;
        }
        return gcd(M, N % M);
    }
}
