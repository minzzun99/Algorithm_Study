package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2630_색종이만들기 {
    private static int[][] arr;
    private static int white = 0;
    private static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0, 0, N);
        System.out.println(white);
        System.out.println(blue);
    }

    private static void divide(int x, int y, int size) {
        boolean allSame = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[x][y] != arr[x + i][y + j]) {
                    allSame = false;
                    break;
                }
                if (!allSame) {
                    break;
                }
            }
        }
        if (allSame) {
            if (arr[x][y] == 0) {
                white++;
            } else {
                blue++;
            }
        } else {
            divide(x, y, size / 2);
            divide(x + size / 2, y, size / 2);
            divide(x, y + size / 2, size / 2);
            divide(x + size / 2, y + size / 2, size / 2);
        }
    }
}
