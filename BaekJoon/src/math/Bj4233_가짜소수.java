package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj4233_가짜소수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            long p = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            if (p == 0 && a == 0) {
                break;
            }


            if (isPrime(p)) {
                sb.append("no\n");
                continue;
            }

            if (pow(a, p, p) == a % p) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        System.out.println(sb);
    }

    private static boolean isPrime(long p) {
        if (p < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static long pow(long a, long idx, long p) {
        if (idx == 1) {
            return a;
        }

        long h = pow(a, idx / 2, p) % p;
        long result = h * h % p;
        if (idx % 2 == 1) {
            result = result * a % p;
        }

        return result;
    }
}
