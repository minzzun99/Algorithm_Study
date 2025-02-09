package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10214_Baseball {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st;
            int Y = 0;
            int K = 0;
            for (int i = 0; i < 9; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                Y += Integer.parseInt(st.nextToken());
                K += Integer.parseInt(st.nextToken());
            }

            if (Y > K) {
                sb.append("Yonsei\n");
            } else if (Y < K) {
                sb.append("Korea\n");
            } else {
                sb.append("Draw\n");
            }
        }

        System.out.println(sb);
    }
}
