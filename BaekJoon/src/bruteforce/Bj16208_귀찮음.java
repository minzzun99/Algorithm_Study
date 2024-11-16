package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj16208_귀찮음 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        long sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            sum += arr[i];
        }

        Arrays.sort(arr);
        long cost = 0;
        for (int i = 0; i < N - 1; i++) {
            cost += (sum - arr[i]) * arr[i];
            sum -= arr[i];
        }

        System.out.println(cost);
    }
}
