package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23806_골뱅이찍기ㅁ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(Math.max(0, 5 * n)));
            sb.append('\n');
        }
        for (int i = 0; i < 3 * n; i++) {
            sb.append("@".repeat(Math.max(0, n)));
            sb.append(" ".repeat(Math.max(0, 3 * n)));
            sb.append("@".repeat(Math.max(0, n)));
            sb.append('\n');
        }
        for (int i = 0; i < n; i++) {
            sb.append("@".repeat(Math.max(0, 5 * n)));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
