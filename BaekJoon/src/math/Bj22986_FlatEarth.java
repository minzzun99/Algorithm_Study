package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj22986_FlatEarth {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            long N = Long.parseLong(st.nextToken());
            long K = Long.parseLong(st.nextToken());

            if (N < K) {
                K = N;
            }

            long sum = (N + N - K) * (K + 1) * 2;
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
