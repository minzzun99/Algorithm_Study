package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24416_피보나치수1 {
    private static int countCode1, countCode2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        countCode1 = 0;
        countCode2 = 0;
        fibCode1(n);
        fibCode2(n);
        System.out.println(countCode1 + " " + countCode2);
    }

    private static int fibCode1(int n) {
        if (n == 1 || n == 2) {
            countCode1++;
            return 1;
        }
        return fibCode1(n - 1) + fibCode1(n - 2);
    }

    private static int fibCode2(int n) {
        int[] fibo = new int[n + 1];
        fibo[1] = 1;
        fibo[2] = fibo[1];
        for (int i = 3; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            countCode2++;
        }
        return fibo[n];
    }
}
