package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1209_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 1; i <= 10; i++) {
            int T = Integer.parseInt(br.readLine());

            int[][] arr = new int[100][100];
            for (int x = 0; x < 100; x++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int y = 0; y < 100; y++) {
                    arr[x][y] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append("#").append(i).append(" ").append(getMaxSum(arr)).append('\n');
        }

        System.out.println(sb);
    }

    private static int getMaxSum(int[][] arr) {
        int maxRow = getMaxRow(arr);
        int maxCol = getMaxCol(arr);
        int maxRightDiagonal = getMaxRightDiagonal(arr);
        int maxLeftDiagonal = getMaxLeftDiagonal(arr);

        return Math.max(Math.max(maxRow, maxCol), Math.max(maxRightDiagonal, maxLeftDiagonal));
    }

    private static int getMaxCol(int[][] arr) {
        int max = 0;
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            for (int j = 0; j < 100; j++) {
                sum += arr[j][i];
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    private static int getMaxRow(int[][] arr) {
        int max = 0;
        for (int i = 0; i < 100; i++) {
            int sum = 0;
            for (int j = 0; j < 100; j++) {
                sum += arr[i][j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }

    private static int getMaxRightDiagonal(int[][] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += arr[i][i];
            max = Math.max(max, sum);
        }

        return max;
    }

    private static int getMaxLeftDiagonal(int[][] arr) {
        int max = 0;
        int sum = 0;
        for (int i = 99; i >= 0; i--) {
            sum += arr[i][99 - i];
            max = Math.max(max, sum);
        }

        return max;
    }
}
