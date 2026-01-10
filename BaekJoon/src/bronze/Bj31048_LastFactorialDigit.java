package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31048_LastFactorialDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int result = 1;
            for (int i = 1; i <= N; i++) {
                result = (result * i) % 10;
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
