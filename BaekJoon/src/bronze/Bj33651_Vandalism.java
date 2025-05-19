package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj33651_Vandalism {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        if (!input.contains("U")) {
            sb.append("U");
        }
        if (!input.contains("A")) {
            sb.append("A");
        }
        if (!input.contains("P")) {
            sb.append("P");
        }
        if (!input.contains("C")) {
            sb.append("C");
        }
        System.out.println(sb);
    }
}
