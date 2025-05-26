package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj9699_RICESACK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<Integer> list;
        for(int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            list.sort(Collections.reverseOrder());
            sb.append(String.format("Case #%d: %d\n", i, list.get(0)));
        }
        System.out.println(sb);
    }
}
