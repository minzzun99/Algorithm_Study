package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2847_게임을만든동준이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = N - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                int num = arr[i - 1] - arr[i] + 1;
                count += num;
                arr[i - 1] -= num;
            }
        }

        System.out.println(count);
    }
}
