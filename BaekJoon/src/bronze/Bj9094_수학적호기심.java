package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9094_수학적호기심 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i = 1; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (((i * i) + (j * j) + M) % (i * j) == 0) {
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }
}
