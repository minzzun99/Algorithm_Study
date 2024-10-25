package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj3036_링 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            int gcd = gcd(arr[0], arr[i]);

            sb.append(arr[0] / gcd).append("/").append(arr[i] / gcd).append('\n');
        }

        System.out.println(sb);
    }

    private static int gcd(int A, int B) {
        if (A % B == 0) {
            return B;
        }
        return gcd(B, A % B);
    }
}
