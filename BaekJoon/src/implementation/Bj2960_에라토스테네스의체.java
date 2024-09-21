package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2960_에라토스테네스의체 {
    private static int N, K;
    private static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        isPrime = new boolean[N + 1];

        int count = 0;
        int result = 0;

        for (int i = 2; i <= N; i++) {
            if (!isPrime[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!isPrime[j]) {
                        isPrime[j] = true;
                        count++;
                        if (count == K) {
                            result = j;
                            break;
                        }
                    }
                }
            }

            if (count == K) {
                break;
            }
        }

        System.out.println(result);
    }
}
