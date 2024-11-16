package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1215_회문1_2 {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;
    private static final int LENGTH = 8;
    private static int findLength;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr;

        for (int tc = 1; tc <= T; tc++) {
            findLength = Integer.parseInt(br.readLine());
            arr = new char[LENGTH][LENGTH];
            for (int i = 0; i < LENGTH; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            sb.append(String.format(PRINT, tc, findPalindrome(arr)));
        }

        System.out.println(sb);
    }

    private static int findPalindrome(char[][] arr) {
        int count = 0;

        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j <= LENGTH - findLength; j++) {
                if (isRowPalindrome(i, j, arr)) {
                    count++;
                }

                if (isColPalindrome(j, i, arr)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isRowPalindrome(int x, int y, char[][] arr) {
        for (int i = 0; i < findLength / 2; i++) {
            if (arr[x][y + i] != arr[x][y + findLength - i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isColPalindrome(int x, int y, char[][] arr) {
        for (int i = 0; i < findLength / 2; i++) {
            if (arr[x + i][y] != arr[x + findLength - i - 1][y]) {
                return false;
            }
        }
        return true;
    }
}
