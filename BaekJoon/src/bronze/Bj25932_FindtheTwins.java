package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj25932_FindtheTwins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String s = br.readLine();
            if (s.contains("17") && s.contains("18")) {
                sb.append(s).append('\n');
                sb.append("both").append('\n');
                sb.append('\n');
            } else if (s.contains("17")) {
                sb.append(s).append('\n');
                sb.append("zack").append('\n');
                sb.append('\n');
            } else if (s.contains("18")) {
                sb.append(s).append('\n');
                sb.append("mack").append('\n');
                sb.append('\n');
            } else {
                sb.append(s).append('\n');
                sb.append("none").append('\n');
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}
