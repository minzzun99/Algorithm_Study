package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj8892_팰린드롬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] words = new String[N];

            for (int i = 0; i < N; i++) {
                words[i] = br.readLine();
            }

            String result = findPalindrome(words);
            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }

    private static String findPalindrome(String[] words) {
        int n = words.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String concatA = words[i] + words[j];
                if (isPalindrome(concatA)) {
                    return concatA;
                }

                String concatB = words[j] + words[i];
                if (isPalindrome(concatB)) {
                    return concatB;
                }
            }
        }

        return "0";
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