package adhoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj27648_증가배열만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        if (N + M - 1 <= K) {
            sb.append("YES").append('\n');
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    sb.append(Math.min(i + j + 1, K)).append(' ');
                }
                sb.append('\n');
            }
        } else {
            sb.append("NO");
        }
        System.out.println(sb);
    }
}
