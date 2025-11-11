package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj26560_Periods {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            if (!s.endsWith(".")) {
                sb.append(s).append(".\n");
            } else {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb);
    }
}
