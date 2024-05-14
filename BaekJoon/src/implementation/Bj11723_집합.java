package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj11723_집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Set<Integer> set = new HashSet<>();

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            if (str.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                set.add(x);
            } else if (str.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                set.remove(x);
            } else if (str.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    sb.append(1).append('\n');
                }else {
                    sb.append(0).append('\n');
                }
            } else if (str.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (set.contains(x)) {
                    set.remove(x);
                }else {
                    set.add(x);
                }
            } else if (str.equals("all")) {
                for (int i = 1; i <= 20; i++) {
                    set.add(i);
                }
            } else {
                set.clear();
            }
        }

        System.out.println(sb);
    }
}
