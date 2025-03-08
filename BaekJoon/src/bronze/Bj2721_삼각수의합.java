package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2721_삼각수의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int sum = 0;
            int N = Integer.parseInt(br.readLine());
            for(int j = 1; j <= N; j++) {
                int A = 0;
                for(int k = 1; k <= (j + 1); k++) {
                    A += k;
                }
                sum += (j * A);
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
