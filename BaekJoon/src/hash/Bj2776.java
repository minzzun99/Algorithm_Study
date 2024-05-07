package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Bj2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");

            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < M; i++) {
                if (set.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }
        }
        System.out.println(sb);
    }
}
