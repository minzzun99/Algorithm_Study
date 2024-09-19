package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2749_피보나치수3 {
    private static int MOD = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()) - 1;

        long[][] origin = {{1, 1}, {1, 0}};
        long[][] result = {{1, 0}, {0, 1}};

        while (N > 0) {
            if (N % 2 == 1) {
                result = multiplyMatrix(result, origin);
            }
            origin = multiplyMatrix(origin, origin);

            N /= 2;
        }

        System.out.println(result[0][0]);
    }

    private static long[][] multiplyMatrix(long[][] arr1, long[][] arr2) {
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
