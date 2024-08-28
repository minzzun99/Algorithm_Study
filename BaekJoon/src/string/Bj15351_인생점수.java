package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj15351_인생점수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String life = br.readLine();
            int lifeScore = 0;
            for (int i = 0; i < life.length(); i++) {
                if (life.charAt(i) == ' ') {
                    continue;
                }
                lifeScore += life.charAt(i) - 'A' + 1;
            }

            if (lifeScore == 100) {
                sb.append("PERFECT LIFE").append('\n');
            } else {
                sb.append(lifeScore).append('\n');
            }
        }
        System.out.println(sb);
    }
}
