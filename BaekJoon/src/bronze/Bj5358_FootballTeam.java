package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj5358_FootballTeam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String str = br.readLine();
            if(str == null || str.isEmpty()) break;
            char[] arr = str.toCharArray();
            for(char c : arr) {
                if (c == 'e') {
                    sb.append("i");
                } else if (c == 'i') {
                    sb.append("e");
                } else if (c == 'E') {
                    sb.append("I");
                } else if (c == 'I') {
                    sb.append("E");
                } else {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
