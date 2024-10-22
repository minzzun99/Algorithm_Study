package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj14465_소가길을건너간이유5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1];
        Arrays.fill(arr, true);

        for (int i = 0; i < B; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = false;
        }

        int brokenCount = 0;
        for (int i = 1; i <= K; i++) {
            if (!arr[i]) {
                brokenCount++;
            }
        }

        int min = brokenCount;
        for (int i = K + 1; i <= N; i++) {
            if (!arr[i]) {
                brokenCount++;
            }
            if (!arr[i - K]) {
                brokenCount--;
            }
            min = Math.min(min, brokenCount);
        }

        System.out.println(min);
    }
}
