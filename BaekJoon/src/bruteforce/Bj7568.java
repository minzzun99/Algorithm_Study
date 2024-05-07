package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            int x = arr[i][0];
            int y = arr[i][1];
            for (int j = 0; j < N; j++) {
                if(i == j) continue;

                if (x < arr[j][0] && y < arr[j][1]) {
                    count++;
                }
            }
            sb.append(count + " ");
        }
        System.out.println(sb);
    }
}
