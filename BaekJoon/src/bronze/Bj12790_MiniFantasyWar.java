package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj12790_MiniFantasyWar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int[] scores = new int[8];
            for (int i = 0; i < 8; i++) {
                scores[i] = Integer.parseInt(st.nextToken());
            }

            for (int j = 0; j < 4; j++) {
                scores[j] += scores[j + 4];
            }

            int result = Math.max(scores[0], 1) + (Math.max(scores[1], 1) * 5)
                    + (Math.max(scores[2], 0) * 2) + (scores[3] * 2);

            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}
