package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11444_피보나치수6 {
    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()) - 1;     // N - 1번만 제곱하면 됨.

        long[][] origin = {{1, 1}, {1, 0}};
        long[][] result = {{1, 0}, {0, 1}};     // 단위행렬

        while (N > 0) {
            if (N % 2 == 1) {
                result = matrixPow(result, origin);
            }
            origin = matrixPow(origin, origin);

            N /= 2;
        }

        System.out.println(result[0][0]);
    }

    private static long[][] matrixPow(long[][] arr1, long[][] arr2) {
        long[][] temp = new long[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    temp[i][j] += arr1[i][k] * arr2[k][j];
                }
                temp[i][j] %= MOD;
            }
        }

        return temp;
    }
}
