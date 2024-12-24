package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj32384_사랑은고려대입니다 {
    private static final String PRINT_MESSAGE = "LoveisKoreaUniversity";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            sb.append(PRINT_MESSAGE).append(" ");
        }

        System.out.println(sb);
    }
}
