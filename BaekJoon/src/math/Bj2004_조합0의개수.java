package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2004_조합0의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        long fiveCount = getFiveCount(A) - getFiveCount(A - B) - getFiveCount(B);
        long twoCount = getTwoCount(A) - getTwoCount(A - B) - getTwoCount(B);

        System.out.println(Math.min(fiveCount, twoCount));
    }

    private static long getFiveCount(long n) {
        long count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }

        return count;
    }

    private static long getTwoCount(long n) {
        long count = 0;
        while (n >= 2) {
            count += n / 2;
            n /= 2;
        }

        return count;
    }
}
