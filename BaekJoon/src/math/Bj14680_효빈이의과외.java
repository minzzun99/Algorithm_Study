package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj14680_효빈이의과외 {
    private static class Matrix {
        int x;
        int y;
        long[][] arr;

        Matrix(int x, int y, long[][] arr) {
            this.x = x;
            this.y = y;
            this.arr = arr;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        ArrayList<Matrix> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            long[][] arr = new long[x][y];
            for (int j = 0; j < x; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < y; k++) {
                    arr[j][k] = Long.parseLong(st.nextToken());
                }
            }

            list.add(new Matrix(x, y, arr));
        }

        for (int i = 0; i < N - 1; i++) {
            Matrix now = list.get(i);
            Matrix next = list.get(i + 1);

            if (now.y != next.x) {
                System.out.println(-1);
                return;
            }

            long[][] arr = new long[now.x][next.y];
            for (int j = 0; j < now.x; j++) {
                for (int k = 0; k < next.y; k++) {
                    long sum = 0;
                    for (int l = 0; l < now.y; l++) {
                        sum += now.arr[j][l] * next.arr[l][k];
                        sum %= 1000000007;
                    }
                    arr[j][k] = sum;
                }
            }

            list.set(i + 1, new Matrix(now.x, next.y, arr));
        }

        Matrix result = list.get(N - 1);
        long resultSum = 0;
        for (int j = 0; j < result.x; j++) {
            for (int k = 0; k < result.y; k++) {
                resultSum += result.arr[j][k];
                resultSum %= 1000000007;
            }
        }
        System.out.println(resultSum);
    }
}
