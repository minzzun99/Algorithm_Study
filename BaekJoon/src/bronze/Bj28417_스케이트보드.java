package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj28417_스케이트보드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        List<Integer> trick;
        int max = -1;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int run1 = Integer.parseInt(st.nextToken());
            int run2 = Integer.parseInt(st.nextToken());
            trick = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                trick.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(trick, Collections.reverseOrder());

            max = Math.max(max, Math.max(run1, run2) + trick.get(0) + trick.get(1));
        }

        System.out.println(max);
    }
}
