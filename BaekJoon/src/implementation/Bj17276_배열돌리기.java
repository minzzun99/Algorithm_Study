package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj17276_배열돌리기 {
    private static int N, d;
    private static int[][] arr;
    private static int[][] X;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            N = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            arr = new int[N][N];
            X = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
                X[i] = arr[i].clone();
            }
            if (d == 0) {
                Arrays.stream(arr).forEach(row -> {
                    Arrays.stream(row).forEach(element -> sb.append(element).append(" "));
                    sb.append('\n');
                });
            } else {
                rotateArray(d);
                Arrays.stream(X).forEach(row -> {
                    Arrays.stream(row).forEach(element -> sb.append(element).append(" "));
                    sb.append('\n');
                });
            }
        }
        System.out.println(sb);
    }


    private static void rotateArray(int d) {
        char direction = 0;
        if (d > 0) {
            direction = 'R';
        } else if (d < 0) {
            direction = 'L';
        }
/*      int rotate90 = Math.abs(d) / 90;*/
        int rotate45 = Math.abs(d) / 45;
/*        if (rotate90 > 0) {
            rotate_90(rotate90, direction);
            if (rotate45 > 0) {
                rotate_45(rotate45, direction);
            }*/
        rotate_45(rotate45, direction);
    }

/*    private static void rotate_90(int time, char direction) {
        if (direction == 'R') {
            for (int t = 0; t < time; t++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        X[i][j] = arr[N - j - 1][i];
                    }
                }
                for (int i = 0; i < N; i++) {
                    arr[i] = X[i].clone();
                }
            }
        } else {
            for (int t = 0; t < time; t++) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        X[i][j] = arr[j][N - i - 1];
                    }
                }
                for (int i = 0; i < N; i++) {
                    arr[i] = X[i].clone();
                }
            }
        }
    }*/

    private static void rotate_45(int time, char direction) {
        if (direction == 'R') {
            for (int t = 0; t < time; t++) {
                for (int i = 0; i < N; i++) {
                    // 십자
                    X[i][i] = arr[N / 2][i];
                    X[i][N - i - 1] = arr[i][N / 2];
                    // 대각
                    X[i][N / 2] = arr[i][i];
                    X[N / 2][N - i - 1] = arr[i][N - i - 1];
                }
                for (int i = 0; i < N; i++) {
                    arr[i] = X[i].clone();
                }
            }
        } else {
            for (int t = 0; t < time; t++) {
                for (int i = 0; i < N; i++) {
                    // 십자
                    X[N - i - 1][i] = arr[N / 2][i];
                    X[i][i] = arr[i][N / 2];
                    // 대각
                    X[N / 2][i] = arr[i][i];
                    X[i][N / 2] = arr[i][N - i - 1];
                }
                for (int i = 0; i < N; i++) {
                    arr[i] = X[i].clone();
                }
            }
        }
    }
}


