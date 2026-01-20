package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj24196_Gömdaord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            sb.append(S.charAt(i));
            i += S.charAt(i) - 'A';
        }
        System.out.println(sb);
    }
}
