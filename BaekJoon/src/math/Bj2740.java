package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj2740 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int N1 = Integer.parseInt(st1.nextToken());
        int M1 = Integer.parseInt(st1.nextToken());
        int[][] arr1 = new int[N1][M1];
        for(int i = 0; i < N1; i++) {
            StringTokenizer stArr1 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M1; j++) {
                arr1[i][j] = Integer.parseInt(stArr1.nextToken());
            }
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int N2 = Integer.parseInt(st2.nextToken());
        int M2 = Integer.parseInt(st2.nextToken());
        int[][] arr2 = new int[N2][M2];
        for(int i = 0; i < N2; i++) {
            StringTokenizer stArr2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M2; j++) {
                arr2[i][j] = Integer.parseInt(stArr2.nextToken());
            }
        }

        int[][] result = new int[N1][M2];
        for(int i = 0; i < N1; i++) {
            for(int j = 0; j < M2; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
                sb.append(result[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
