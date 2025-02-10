package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10103_주사위게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int C = 100;
        int S = 100;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int cScore = Integer.parseInt(st.nextToken());
            int sScore = Integer.parseInt(st.nextToken());
            if (cScore == sScore) {
                continue;
            }

            if (cScore > sScore) {
                S -= cScore;
            } else {
                C -= sScore;
            }
        }

        sb.append(C).append("\n").append(S);
        System.out.println(sb);
    }
}
