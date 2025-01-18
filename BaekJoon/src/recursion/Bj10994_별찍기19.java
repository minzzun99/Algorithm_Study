package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj10994_별찍기19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        char[][] stars = new char[4 * (N - 1) + 1][4 * (N - 1) + 1];
        for (char[] star : stars) {
            Arrays.fill(star, ' ');

        }
        makeStars(0, stars, N);
        for (char[] star : stars) {
            for (char s : star) {
                sb.append(s);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static void makeStars(int start, char[][] stars, int N) {
        if (N <= 0) {
            return;
        }

        for (int i = start; i < start + 4 * (N - 1) + 1; i++) {
            stars[start][i] = '*';
            stars[i][start] = '*';
            stars[start + 4 * (N - 1)][i] = '*';
            stars[i][start +  4 * (N - 1)] = '*';
        }
        makeStars(start + 2, stars, N-1);
    }
}
