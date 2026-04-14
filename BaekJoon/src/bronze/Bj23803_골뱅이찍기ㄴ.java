package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23803_골뱅이찍기ㄴ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4 * N; i++) {
            sb.append("@".repeat(Math.max(0, N)));
            sb.append('\n');
        }
        for (int i = 0; i < N; i++) {
            sb.append("@".repeat(Math.max(0, 5 * N)));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
