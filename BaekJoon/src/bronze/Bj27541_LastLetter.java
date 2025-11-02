package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27541_LastLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        if (S.charAt(S.length() - 1) == 'G') {
            for (int i = 0; i < S.length() - 1; i++) {
                sb.append(S.charAt(i));
            }
        } else {
            sb.append(S).append("G");
        }
        System.out.println(sb);
    }
}
