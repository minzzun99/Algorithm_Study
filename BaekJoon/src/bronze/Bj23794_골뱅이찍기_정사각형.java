package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj23794_골뱅이찍기_정사각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N + 2; i++) {
            if (i == 0 || i == (N + 1)) {
                sb.append("@".repeat(Math.max(0, N + 2)));
            } else {
                sb.append("@");
                sb.append(" ".repeat(N));
                sb.append("@");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
