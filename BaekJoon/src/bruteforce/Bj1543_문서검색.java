package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1543_문서검색 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();
        char[] docArr = document.toCharArray();
        int wordLength = word.length();
        int idx = 0;
        int count = 0;
        while (idx + wordLength <= document.length()) {
            boolean flag = true;
            for (int i = 0; i < wordLength; i++) {
                if (word.charAt(i) != docArr[idx + i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                idx += wordLength;
            } else {
                idx++;
            }
        }
        System.out.println(count);
    }
}
