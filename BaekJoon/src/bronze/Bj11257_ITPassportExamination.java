package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11257_ITPassportExamination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int sum = b + c + d;
            sb.append(a).append(" ").append(sum).append(" ");

            if (sum >= 55) {
                if (b >= 35 * 0.3 && c >= 25 * 0.3 && d >= 40 * 0.3) {
                    sb.append("PASS").append("\n");
                } else {
                    sb.append("FAIL").append("\n");
                }
            } else {
                sb.append("FAIL").append("\n");
            }
        }

        System.out.println(sb);
    }
}
