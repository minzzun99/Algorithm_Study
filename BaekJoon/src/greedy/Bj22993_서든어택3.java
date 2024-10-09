package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj22993_서든어택3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        for (int i = 0; i < N - 1; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        boolean result = true;
        for (int i = 0; i < N - 1; i++) {
            if (A > arr[i]) {
                A += arr[i];
            } else {
                result = false;
                break;
            }
        }

        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
