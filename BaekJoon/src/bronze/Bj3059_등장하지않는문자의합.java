package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3059_등장하지않는문자의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            int sum = 0;
            for (int i = 0; i < 26; i++) {
                if (!s.contains(String.valueOf((char) ('A' + i)))) {
                    sum += Integer.parseInt(String.valueOf('A' + i));
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
