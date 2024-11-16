package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_회문2_2 {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;
    private static final int LENGTH = 100;
    private static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int tNum = Integer.parseInt(br.readLine());
            arr = new char[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            sb.append(String.format(PRINT, tNum, findMaxPalindrome()));
        }

        System.out.println(sb);
    }

    private static int findMaxPalindrome() {
        for (int i = LENGTH; i >= 1; i--) {
            if (findPalindrome(i)) {
                return i;
            }
        }

        return 0;
    }

    private static boolean findPalindrome(int l) {
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j <= LENGTH - l; j++) {
                if (isRowPalindrome(i, j, l)) {
                    return true;
                }

                if (isColPalindrome(j, i, l)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isColPalindrome(int x, int y, int l) {
        for (int i = 0; i < l / 2; i++) {
            if (arr[x + i][y] != arr[x + l - i - 1][y]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isRowPalindrome(int x, int y, int l) {
        for (int i = 0; i < l / 2; i++) {
            if (arr[x][y + i] != arr[x][y + l - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
