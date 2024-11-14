package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA1215_회문1 {
    public static final String PRINT_FORMAT = "#%d %d%n";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr;
        for (int i = 1; i <= 10; i++) {
            int length = Integer.parseInt(br.readLine());
            arr = new char[8][8];
            for (int j = 0; j < 8; j++) {
                arr[j] = br.readLine().toCharArray();
            }

            sb.append(String.format(PRINT_FORMAT, i, countPalindrome(arr, length)));
        }

        System.out.println(sb);
    }

    private static int countPalindrome(char[][] arr, int length) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= arr.length - length; j++) {
                String row = "";
                String col = "";
                for (int k = 0; k < length; k++) {
                    row += arr[i][j + k];
                    col += arr[j + k][i];
                }
                if (checkPalindrome(row)) {
                    count++;
                }

                if (checkPalindrome(col)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean checkPalindrome(String target) {
        StringBuilder reverse = new StringBuilder(target).reverse();
        if (target.equals(reverse.toString())) {
            return true;
        }
        return false;
    }
}
