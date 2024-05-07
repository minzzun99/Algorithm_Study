package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2447 {
    private static char[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        star = new char[N][N];
        for (char[] ch : star) {
            Arrays.fill(ch, ' ');
        }
        makeStar(0, 0, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(star[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void makeStar(int x, int y, int n) {
        if (n == 1) {
            star[x][y] = '*';
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!(i == 1 && j == 1)) {
                    makeStar(x + i*(n / 3), y + j * (n / 3), n / 3);
                }
            }
        }
    }
}
