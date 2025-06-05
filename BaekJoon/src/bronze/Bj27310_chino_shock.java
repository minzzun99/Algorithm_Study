package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj27310_chino_shock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        int col = 0;
        int under = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ':') {
                col++;
            } else if (c == '_') {
                under++;
            }
        }
        sb.append(input.length() + col + (under * 5));
        System.out.println(sb);
    }
}
