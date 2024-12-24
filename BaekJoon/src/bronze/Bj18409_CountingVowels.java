package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj18409_CountingVowels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            char a = S.charAt(i);
            if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                result++;
            }
        }

        System.out.println(result);
    }
}
