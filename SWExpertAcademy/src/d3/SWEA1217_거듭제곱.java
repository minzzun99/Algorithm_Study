package d3;

import java.util.Scanner;

public class SWEA1217_거듭제곱 {
    public static final String PRINT_FORMAT = "#%d %d%n";
    private static final int TEST = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= TEST; i++) {
            int t = scanner.nextInt();
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            System.out.printf(PRINT_FORMAT, i, getPow(N, M));
        }
    }

    private static int getPow(int N, int M) {
        if (M == 0) {
            return 1;
        }

        return N * getPow(N, M - 1);
    }
}
