package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj14584_암호해독 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String pw = br.readLine();
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
        }

        StringBuilder decoding;
        for (int i = 0; i < 26; i++) {
            decoding = new StringBuilder();
            for (int j = 0; j < pw.length(); j++) {
                char c = alertAlphabet((char) (pw.charAt(j) + i));
                decoding.append(c);
            }
            for (int j = 0; j < words.length; j++) {
                String decodingPW = decoding.toString();
                if (decodingPW.contains(words[j])) {
                    System.out.println(decodingPW);
                    return;
                }
            }
        }
    }

    private static char alertAlphabet(char c) {
        if (c > 'z') {
            return (char)(96 + (c - 'z'));
        } else {
            return c;
        }
    }
}
