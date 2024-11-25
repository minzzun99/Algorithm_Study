package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30993_자동차주차 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long N = Long.parseLong(st.nextToken());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        long result = getFactorial(N) / (getFactorial(A) * getFactorial(B) * getFactorial(C));
        System.out.println(result);
    }

    private static long getFactorial(long num) {
        if (num == 0) {
            return 1;
        }

        return num * getFactorial(num - 1);
    }
}
