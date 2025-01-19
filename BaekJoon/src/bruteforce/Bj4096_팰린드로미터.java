package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj4096_팰린드로미터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String N = br.readLine();
            if (N.equals("0")) break;

            int length = N.length();
            int count = countPalindromeMeter(N, length);

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }

    private static int countPalindromeMeter(String N, int length) {
        int count = 0;
        int number = Integer.parseInt(N);
        while (!isPalindrome(String.valueOf(fillZero(number, length)))) {
            number++;
            count++;
        }
        return count;
    }

    private static boolean isPalindrome(String number) {
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static String fillZero(int number, int length) {
        String str = String.valueOf(number);
        StringBuilder sb = new StringBuilder();
        while (sb.length() + str.length() < length) {
            sb.append("0");
        }
        sb.append(str);
        return sb.toString();
    }
}
