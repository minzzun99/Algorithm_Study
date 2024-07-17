package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10570_FavoriteNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int V = Integer.parseInt(br.readLine());        //쪽지 개수
            int[] arr = new int[1001];
            for (int i = 0; i < V; i++) {
                int S = Integer.parseInt(br.readLine());
                arr[S]++;
            }
            int max = 0;
            int idx = 0;
            for (int i = 1; i < 1001; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    idx = i;
                }
            }
            sb.append(idx).append('\n');
        }
        System.out.println(sb);
    }
}
