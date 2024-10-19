package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj5347_LCM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long lcm = a * b / gcd(a, b);
            sb.append(lcm).append('\n');
        }

        System.out.println(sb);
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
