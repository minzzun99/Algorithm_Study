package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11068_회문인수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if (checkNumber(num)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        System.out.println(sb);
    }

    private static boolean checkNumber(int num) {
        for (int i = 2; i <= 64; i++) {
            if (isPalindrome(convertNumber(num, i))) {
                return true;
            }
        }
        return false;
    }

    private static String convertNumber(int num, int b) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int tmp = num % b;
            if (tmp >= 10) {
                sb.append((char) (tmp - 10 + 'a'));
            } else {
                sb.append(tmp);
            }

            num /= b;
        }

        return sb.reverse().toString();
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
