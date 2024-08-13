package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj6064_카잉달력 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine()," " );
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int rx = Integer.parseInt(st.nextToken()) - 1;
            int ry = Integer.parseInt(st.nextToken()) - 1;

            int lcm = N * M / gcd(N, M);

            int year = rx;
            while (year <= lcm) {
                if (year % N == ry) {
                    sb.append(year + 1).append('\n');
                    break;
                }
                year += M;
            }

            if (year > lcm) {
                sb.append(-1).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static int gcd(int M, int N) {
        if (M % N == 0) {
            return N;
        }
        return gcd(N, M % N);
    }
}
