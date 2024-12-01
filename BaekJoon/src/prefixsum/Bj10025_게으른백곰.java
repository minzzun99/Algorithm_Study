package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10025_게으른백곰 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[1_000_001];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int amount = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());
            arr[index] = amount;
        }

        int sum =0;
        int maxIndex = 2 * K + 1;
        if (maxIndex > 1_000_000) {
            maxIndex = 1_000_001;
        }

        for (int i = 0; i < maxIndex;i++) {
            sum += arr[i];
        }

        int max = sum;
        for (int i = 0; 2 * K + 1 + i <= 1_000_000; i++) {
            sum -= arr[i];
            sum += arr[2 * K + 1 + i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
