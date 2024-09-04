package implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bj10469_사이나쁜여왕들 {
    private static boolean[] rows = new boolean[8];
    private static boolean[] cols = new boolean[8];
    private static boolean[] diag1 = new boolean[15];
    private static boolean[] diag2 = new boolean[15];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (s.charAt(j) != '*') continue;
                count++;
                if (!checkBoard(i, j)) {
                    System.out.println("invalid");
                    return;
                }
            }
        }
        System.out.println(count == 8 ? "valid" : "invalid");
    }

    private static boolean checkBoard(int i, int j) {
        if (rows[i] || cols[j] || diag1[i + j] || diag2[i - j + 7]) {
            return false;
        }

        rows[i] = true;
        cols[j] = true;
        diag1[i + j] = true;
        diag2[i - j + 7] = true;

        return true;
    }
}
