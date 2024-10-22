package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3062_수뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringBuilder sb2 = new StringBuilder();
            String str = br.readLine();
            String str2 = sb2.append(str).reverse().toString();

            String sum = String.valueOf(Integer.parseInt(str) + Integer.parseInt(str2));
            if (isPalindrome(sum)) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    private static boolean isPalindrome(String sum) {
        StringBuilder check = new StringBuilder();
        String target = check.append(sum).reverse().toString();
        if (sum.equals(target)) {
            return true;
        } else {
            return false;
        }
    }
}
