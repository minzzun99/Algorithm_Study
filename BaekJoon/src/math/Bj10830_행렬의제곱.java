package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj10830_행렬의제곱 {
    private static int N;
    private static long B;
    private static int MOD = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        B = Long.parseLong(st.nextToken());

        int[][] origin = new int[N][N];
        int[][] result = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
            }
            result[i][i] = 1;       // 단위 행렬    대각선만 1이고 나머지는 0 곱하면 같은 숫자가 나옴
        }

        while (B > 0) {
            if (B % 2 == 1) {
                result = multiplyMatrix(result, origin);
            }
            origin = multiplyMatrix(origin, origin);
            B /= 2;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(' ');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static int[][] multiplyMatrix(int[][] arr1, int[][] arr2) {
        int[][] temp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    temp[i][j] += arr1[i][k] * arr2[k][j];
                }
                temp[i][j] %= MOD;
            }
        }

        return temp;
    }
}
