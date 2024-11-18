package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9935_문자열폭발 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c);
            if (sb.length() >= bomb.length()) {
                if (sb.substring(sb.length() - bomb.length()).equals(bomb)) {
                    sb.delete(sb.length() - bomb.length(), sb.length());
                }
            }
        }

        if (sb.isEmpty()) {
            System.out.println("FRULA");
        } else {
            System.out.println(sb);
        }
    }
}
