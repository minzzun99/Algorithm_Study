package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj21921_블로그 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }

        int max = 0;
        int count = 0;
        for (int i = X; i <= N; i++) {
            int sum = arr[i] - arr[i - X];
            if (max > sum) {
                continue;
            } else if (max == sum && max != 0) {
                count++;
            } else {
                max = sum;
                count = 1;
            }
        }

        if (max == 0) {
            sb.append("SAD");
        } else {
            sb.append(max).append('\n').append(count);
        }

        System.out.println(sb);
    }
}
