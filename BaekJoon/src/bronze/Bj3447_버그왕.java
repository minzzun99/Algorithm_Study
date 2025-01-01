package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj3447_버그왕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s == null) {
                break;
            }

            while (s.contains("BUG")) {
                s = s.replace("BUG", "");
            }
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}
