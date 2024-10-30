package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1213_팰린드롬만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alphabet = new int[26];
        for (int i = 0; i < input.length(); i++) {
            alphabet[input.charAt(i) - 'A']++;
        }

        int oddCount = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] % 2 == 1) {
                oddCount++;
            }
        }

        if (oddCount > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < alphabet[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        String result = sb.toString();

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] % 2 == 1) {
                result += (char) (i + 'A');
                break;
            }
        }

        result += sb.reverse().toString();
        System.out.println(result);
    }
}
