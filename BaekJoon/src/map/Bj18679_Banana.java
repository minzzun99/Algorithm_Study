package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj18679_Banana {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, String> word = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " = ");
            String A = st.nextToken();
            String B = st.nextToken();
            word.put(A, B);
        }

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < K; i++) {
                sb.append(word.get(st.nextToken())).append(" ");
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
