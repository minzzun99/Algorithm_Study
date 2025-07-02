package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4880_다음수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            if(A == 0 && B == 0 && C == 0) break;

            int N = B - A;
            int M = C - B;
            if (N == M) {
                sb.append(String.format("AP %d", (C + M))).append('\n');
            } else {
                sb.append(String.format("GP %d", (C + (M * (M / N))))).append('\n');
            }
        }
        System.out.println(sb);
    }
}
