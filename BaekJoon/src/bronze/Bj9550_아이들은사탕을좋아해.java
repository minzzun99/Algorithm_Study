package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj9550_아이들은사탕을좋아해 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int candy = Integer.parseInt(st.nextToken());
                sum += candy / K;
            }

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
