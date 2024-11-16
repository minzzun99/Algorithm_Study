package ssafy13;

import java.util.Scanner;

public class SWEA1217_거듭제곱 {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int tc = 1; tc <= T; tc++) {
            int tNum = scanner.nextInt();
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            System.out.printf(PRINT, tNum, getPow(N, M));
        }
    }

    private static int getPow(int N, int M) {
        if (M == 0) {
            return 1;
        }

        return N * getPow(N, M - 1);
    }
}
