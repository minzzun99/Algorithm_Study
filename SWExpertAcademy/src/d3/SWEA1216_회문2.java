package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1216_회문2 {
    private static final int TEST_CASE = 10;
    private static final int LENGTH = 100;
    public static final String PRINT_FORMAT = "#%d %d%n";
    private static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < TEST_CASE; t++) {
            int tc = Integer.parseInt(br.readLine());
            arr = new char[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            for (int l = LENGTH; l > 0; l--) {
                if (isPalindrome(l)) {
                    sb.append(String.format(PRINT_FORMAT, tc, l));
                }
            }
        }

        System.out.println(sb);
    }

    private static boolean isPalindrome(int l) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < LENGTH - l; j++) {
                if (checkRow(i, j, l) || checkCol(j, i, l)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean checkRow(int i, int j, int l) {
        for (int x = 0; x < l / 2; x++) {
            if (arr[i][j + x] != arr[i][j + l - 1 - x]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(int i, int j, int l) {
        for (int x = 0; x < l / 2; x++) {
            if (arr[i + x][j] != arr[i + l - 1 - x][j]) {
                return false;
            }
        }
        return true;
    }
}