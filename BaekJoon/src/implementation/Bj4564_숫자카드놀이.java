package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4564_숫자카드놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            int temp = 1;
            while (String.valueOf(N).length() != 1) {
                sb.append(N).append(' ');

                for (char c : String.valueOf(N).toCharArray()) {
                    int digit = c - '0';
                    temp *= digit;
                }
                N = temp;
                temp = 1;
            }
            sb.append(N).append('\n');
        }
        System.out.println(sb);
    }
}
