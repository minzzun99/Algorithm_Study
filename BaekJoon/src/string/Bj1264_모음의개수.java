package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1264_모음의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                String s = String.valueOf(str.charAt(i));
                if (s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e")
                        || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o")
                        || s.equalsIgnoreCase("u")) {
                    count++;
                }
            }
            sb.append(count).append('\n');
            count = 0;
        }
        System.out.println(sb);
    }
}
