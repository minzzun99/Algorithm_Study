package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9306_Practice_RollCall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String firstName = br.readLine();
            String lastName = br.readLine();
            sb.append(String.format("Case %d: %s, %s%n", i, lastName, firstName));
        }
        System.out.println(sb);
    }
}
