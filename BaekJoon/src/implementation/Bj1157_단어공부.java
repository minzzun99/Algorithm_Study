package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1157_단어공부 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }
        char c = ' ';
        int max = -1;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                c = (char) (i + 'A');
            } else if (arr[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}
