package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj16464_가주아 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            while (K != 1) {
                if (K % 2 == 1) {
                    sb.append("Gazua").append('\n');
                    break;
                }
                K /= 2;
            }
            if (K == 1) {
                sb.append("GoHanGang").append('\n');
            }
        }
        System.out.println(sb);
    }
}
