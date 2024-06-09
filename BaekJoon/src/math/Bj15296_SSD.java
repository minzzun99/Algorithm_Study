package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj15296_SSD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int c = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int result = sumSquaredDigits(b, n);
            sb.append(c).append(' ').append(result).append('\n');
        }
        System.out.println(sb);
    }

    private static int sumSquaredDigits(int b, int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % b;
            sum += digit * digit;
            n /= b;
        }
        return sum;
    }
}
