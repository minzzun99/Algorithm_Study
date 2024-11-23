package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11008_복붙의달인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String S = st.nextToken();
            String P = st.nextToken();
            S = S.replaceAll(P, " ");
            sb.append(S.length()).append('\n');
        }

        System.out.println(sb);
    }
}
