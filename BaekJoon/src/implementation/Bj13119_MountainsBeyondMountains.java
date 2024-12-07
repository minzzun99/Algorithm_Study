package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj13119_MountainsBeyondMountains {
    private static int N, M, X;
    private static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], '.');
        }

        // 산 표시
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = N - 1; j > N - 1 - num; j--) {
                arr[j][i] = '#';
            }
        }

        // 고속도로 표시
        for (int i = 0; i < M; i++) {
            if (arr[N - X][i] == '#') {
                arr[N - X][i] = '*';
            } else {
                arr[N - X][i] = '-';
            }

            // 다리 표시
            if (i % 3 == 2) {
                for (int j = N - X + 1; j < N; j++) {
                    if (arr[j][i] == '#') {
                        break;
                    }
                    arr[j][i] = '|';
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
