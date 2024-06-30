package bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj28701_세제곱의합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int first = 0;
        for (int i = 1; i <= N; i++) {
            first += i;
        }
        sb.append(first).append('\n');
        sb.append((int)Math.pow(first, 2)).append('\n');
        int third = 0;
        for (int i = 1; i <= N; i++) {
            third += (int)Math.pow(i, 3);
        }
        sb.append(third).append('\n');
        System.out.println(sb);
    }
}
