package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28324_스케이트연습 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        arr[N - 1] = 1;
        long sum = 1;
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] <= arr[i + 1]) {
                sum += arr[i];
            } else {
                arr[i] = arr[i + 1] + 1;
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}
