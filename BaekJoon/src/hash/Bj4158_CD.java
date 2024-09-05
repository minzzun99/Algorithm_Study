package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj4158_CD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {
                break;
            }

            Set<Integer> set = new HashSet<>();
            while (N-- > 0) {
                set.add(Integer.parseInt(br.readLine()));
            }

            int count = 0;
            while (M-- > 0) {
                if (set.contains(Integer.parseInt(br.readLine()))) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
