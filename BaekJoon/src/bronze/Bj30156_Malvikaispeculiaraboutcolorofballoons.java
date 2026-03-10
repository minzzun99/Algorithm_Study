package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj30156_Malvikaispeculiaraboutcolorofballoons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            if (s == null || s.isBlank()) {
                sb.append(0).append('\n');
                continue;
            }

            int countA = 0;
            int countB = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    countA++;
                } else if (c == 'b') {
                    countB++;
                }
            }

            sb.append(Math.min(countA, countB)).append('\n');
        }

        System.out.print(sb);
    }
}
