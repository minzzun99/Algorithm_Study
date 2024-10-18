package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj1622_공통순열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int[] word;
        while (true) {
            String str1 = br.readLine();
            if (str1 == null) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            word = new int[26];

            for (int i = 0; i < str1.length(); i++) {
                word[str1.charAt(i) - 97]++;
            }

            String str2 = br.readLine();
            for (int i = 0; i < str2.length(); i++) {
                int idx = str2.charAt(i) - 97;
                if (word[idx] > 0) {
                    word[idx]--;
                    sb.append(str2.charAt(i));
                }
            }

            char[] arr = sb.toString().toCharArray();
            Arrays.sort(arr);

            for (char c : arr) {
                result.append(c);
            }
            result.append('\n');
        }
        System.out.println(result);
    }
}
