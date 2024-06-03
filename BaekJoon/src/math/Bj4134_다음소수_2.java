package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4134_다음소수_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            long N = Long.parseLong(br.readLine());
            if (N <= 2) {
                sb.append(2).append('\n');
                continue;
            }
            while (true) {
                boolean flag = true;
                for (int i = 2; i < Math.sqrt(N) + 1; i++) {
                    if (N % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.append(N).append('\n');
                    break;
                }
                N++;
            }
        }
        System.out.println(sb);
    }
}
