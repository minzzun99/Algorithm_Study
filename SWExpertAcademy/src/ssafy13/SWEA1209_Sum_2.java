package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1209_Sum_2 {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;
    private static final int LENGTH = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr;

        for (int tc = 1; tc <= T; tc++) {
            int tNum = Integer.parseInt(br.readLine());
            arr = new int[LENGTH][LENGTH];
            for (int i = 0; i < arr.length; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(String.format(PRINT, tNum, getMax(arr)));
        }

        System.out.println(sb);
    }

    private static int getMax(int[][] arr) {
        int max = 0;

        for (int i = 0; i < LENGTH; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < LENGTH; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            max = Math.max(max, Math.max(rowSum, colSum));
        }


        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < LENGTH; i++) {
            leftSum += arr[i][i];
            rightSum += arr[i][LENGTH - i - 1];

            max = Math.max(max, Math.max(leftSum, rightSum));
        }

        return max;
    }
}
