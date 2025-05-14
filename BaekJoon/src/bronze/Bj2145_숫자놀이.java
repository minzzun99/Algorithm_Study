package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2145_숫자놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;

            int sum = N;
            while (sum >= 10) {
                sum = getSum(sum);
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    private static int getSum(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }
}
