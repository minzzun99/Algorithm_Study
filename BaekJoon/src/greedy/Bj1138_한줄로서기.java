package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1138_한줄로서기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] line = new int[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i] == 0) {
                    if (line[j] == 0) {
                        line[j] = i;
                        break;
                    }
                } else if (line[j] == 0) {
                    arr[i]--;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            sb.append(line[i]).append(' ');
        }
        System.out.println(sb);
    }
}
