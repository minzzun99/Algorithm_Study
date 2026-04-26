package goodbyeboj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A번_GoodBye별찍기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 2 * N; i >= 1; i--) {
            for (int j = 1; j <= 2 * N; j++) {
                if (i == j) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append(" ");

            int k = (i > N) ? (2 * N - i + 1) : i;
            int left = N - k + 1;
            int right = N + k + 1;

            for (int j = 1; j <= 2 * N + 1; j++) {
                if (j == left || j == right) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}

// 4, 7, 9
// 3, 6, 10
// 2, 6, 10
// 1, 7, 9

// 6, 10, 12
// 5, 9, 13
// 4, 8, 14
// 3, 8, 14
// 2, 9, 13
// 1, 10, 12