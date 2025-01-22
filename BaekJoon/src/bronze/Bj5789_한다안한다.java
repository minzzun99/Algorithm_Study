package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5789_한다안한다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String s = br.readLine();
            if (s.charAt(s.length() / 2) == s.charAt(s.length() / 2 - 1)) {
                sb.append("Do-it\n");
            } else {
                sb.append("Do-it-Not\n");
            }
        }
        System.out.println(sb);
    }
}
