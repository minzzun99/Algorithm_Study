package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj20540_연길이의이상형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        for (int i = 0; i < 4; i++) {
            char c = input.charAt(i);

            if (c == 'I'){
                sb.append("E");
            } else if (c == 'E') {
                sb.append("I");
            } else if (c == 'N') {
                sb.append("S");
            } else if (c == 'S') {
                sb.append("N");
            } else if (c == 'T') {
                sb.append("F");
            } else if (c == 'F') {
                sb.append("T");
            } else if (c == 'J') {
                sb.append("P");
            } else {
                sb.append("J");
            }
        }

        System.out.println(sb);
    }
}
