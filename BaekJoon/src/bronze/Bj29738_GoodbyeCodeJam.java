package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj29738_GoodbyeCodeJam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(String.format("Case #%d: ", i));
            if (N > 4500) {
                sb.append("Round 1\n");
            } else if (N > 1000) {
                sb.append("Round 2\n");
            } else if (N > 25) {
                sb.append("Round 3\n");
            } else {
                sb.append("World Finals\n");
            }
        }
        System.out.println(sb);
    }
}
