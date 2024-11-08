package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9325_얼마 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int S = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int Q = Integer.parseInt(st.nextToken());
                int P = Integer.parseInt(st.nextToken());
                S += Q * P;
            }
            sb.append(S).append('\n');
        }

        System.out.println(sb);
    }
}
