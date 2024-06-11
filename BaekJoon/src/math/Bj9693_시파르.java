package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9693_시파르 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            long n = Long.parseLong(br.readLine());
            if (n == 0L) {
                break;
            }
            count++;

            int m = 0;
            for (long i = 5; n / i >= 1; i *= 5) {
                m += n / i;
            }

            sb.append("Case #").append(count).append(": ").append(m).append('\n');
        }
        System.out.println(sb);
    }
}
