package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3024_마라톤틱택토 {
    private static char[][] arr;
    private static int N;
    private static int[] dx = {1, 0, 1, -1};
    private static int[] dy = {0, 1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < 4; k++) {
                    int count = 0;
                    for (int p = 1; p <= 2; p++) {
                        if (arr[i][j] == isPossible(i + (p * dx[k]), j + (p * dy[k]))) {
                            count++;
                        }
                    }
                    if (count == 2 && arr[i][j] != '.') {
                        System.out.println(arr[i][j]);
                        return;
                    }
                }
            }
        }
        System.out.println("ongoing");
    }

    private static char isPossible(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= N) {
            return ';';
        } else {
            return arr[x][y];
        }
    }
}
