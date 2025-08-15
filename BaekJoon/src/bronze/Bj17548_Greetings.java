package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj17548_Greetings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'e') {
                sb.append(ch).append(ch);
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
