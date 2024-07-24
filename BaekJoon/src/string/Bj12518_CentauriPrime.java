package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj12518_CentauriPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String country = br.readLine();
            char last = country.charAt(country.length() - 1);
            if (country.length() == 1) {
                last = (char) (country.charAt(0) + 32);
            }

            if (last == 'y') {
                sb.append("Case #").append(i).append(": ").append(country).append(" is ruled by nobody.").append('\n');
            } else if (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u') {
                sb.append("Case #").append(i).append(": ").append(country).append(" is ruled by a queen.").append('\n');
            } else {
                sb.append("Case #").append(i).append(": ").append(country).append(" is ruled by a king.").append('\n');
            }
        }
        System.out.println(sb);
    }
}
