package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1343_폴리오미노 {
    private static final int A_SIZE = 4;
    private static final int B_SIZE = 2;
    private static final String A = "AAAA";
    private static final String B = "BB";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] board = br.readLine().toCharArray();

        int count = 0;
        for (char c : board) {
            if (c == 'X') {
                count++;
            } else {
                if (!polyomino(sb, count)) {
                    System.out.println(-1);
                    return;
                }
                sb.append('.');
                count = 0;
            }
        }

        if (!polyomino(sb, count)) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }

    private static boolean polyomino(StringBuilder sb, int count) {
        while (count >= A_SIZE) {
            sb.append(A);
            count -= A_SIZE;
        }
        while (count >= B_SIZE) {
            sb.append(B);
            count -= B_SIZE;
        }

        return count == 0;
    }
}