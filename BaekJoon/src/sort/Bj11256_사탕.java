package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj11256_사탕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        List<Integer> boxes;

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            boxes = new ArrayList<>();

            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                boxes.add(x * y);
            }

            boxes.sort(Collections.reverseOrder());

            int count = 0;
            for (int i = 0; i < boxes.size(); i++) {
                if (J <= 0) {
                    break;
                }

                J -= boxes.get(i);
                count++;
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
