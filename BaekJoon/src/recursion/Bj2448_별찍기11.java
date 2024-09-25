package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2448_별찍기11 {
    private static char[][] star;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        star = new char[N][2 * N - 1];
        for (char[] ch : star) {
            Arrays.fill(ch, ' ');
        }

        makeStar(0, N - 1, N);      // N - 1이 맨 위 꼭지점의 별

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                sb.append(star[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    private static void makeStar(int x, int y, int n) {
        if (n == 3) {
            star[x][y] = '*';
            star[x + 1][y - 1] = star[x + 1][y + 1] = '*';
            star[x + 2][y - 1] = star[x + 2][y - 2] = star[x + 2][y] = star[x + 2][y + 1] = star[x + 2][y + 2]= '*';
        } else {
            int divideNum = n / 2;
            makeStar(x, y, divideNum);      // 맨 위 삼각형
            makeStar(x + divideNum, y - divideNum, divideNum);      // 아래 왼쪽 삼각형
            makeStar(x + divideNum, y + divideNum, divideNum);      // 아래 오른쪽 삼각형
        }
    }
}
