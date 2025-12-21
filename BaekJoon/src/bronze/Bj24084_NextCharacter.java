package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24084_NextCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == 'J') {
                System.out.println(S.charAt(i - 1));
            }
        }
    }
}
