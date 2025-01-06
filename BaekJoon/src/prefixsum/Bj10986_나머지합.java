package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10986_나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] arr = new long[N + 1];
        long[] result = new long[M];
        long count = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Long.parseLong(st.nextToken()) + arr[i - 1];
            long num = arr[i] % M;
            if (num == 0) {
                count++;
            }
            result[(int)num]++;
        }

        for (int i = 0; i < M; i++) {
            if (result[i] > 1) {
                count += (result[i] * (result[i] - 1) / 2);
            }
        }

        System.out.println(count);
    }
}

// 1 3 6 7 9 -> 3
// x 2 5 6 8 -> 1
// x x 3 4 6 -> 2
// x x x 1 3 -> 1
// x x x x 2
