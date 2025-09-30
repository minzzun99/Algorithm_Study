package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj31495_그게무슨코드니 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        char first = input.charAt(0);
        char end = input.charAt(input.length() - 1);

        if (first == '"' && end == '"') {
            if (input.length() <= 2) {
                sb.append("CE");
            } else {
                sb.append(input.substring(1, input.length() - 1));
            }
        } else {
            sb.append("CE");
        }

        System.out.println(sb);
    }
}
