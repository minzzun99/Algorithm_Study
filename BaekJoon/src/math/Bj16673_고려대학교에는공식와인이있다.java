package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj16673_고려대학교에는공식와인이있다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        System.out.println(calculate(K, P, C));
    }

    private static int calculate(int K, int P, int C) {
        int sum = 0;
        for (int i = 1; i <= C; i++) {
            sum += ((K * i) + (P * (i * i)));
        }

        return sum;
    }
}
