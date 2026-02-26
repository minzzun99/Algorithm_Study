package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj34400_민규의서카디안리듬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int time = Integer.parseInt(br.readLine());
            if (time % 25 < 17) {
                sb.append("ONLINE\n");
            } else {
                sb.append("OFFLINE\n");
            }
        }
        System.out.println(sb);
    }
}
