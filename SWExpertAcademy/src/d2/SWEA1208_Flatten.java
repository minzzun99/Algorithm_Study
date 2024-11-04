package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA1208_Flatten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int t = 1; t <= 10; t++) {
            int dump = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");

            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }

            while (dump-- > 0) {
                numbers.sort(Collections.reverseOrder());
                numbers.set(0, numbers.get(0) - 1);
                numbers.set(99, numbers.get(99) + 1);
            }
            numbers.sort(Collections.reverseOrder());

            int result = numbers.get(0) - numbers.get(99);

            sb.append("#").append(t)
                    .append(" ")
                    .append(result)
                    .append('\n');
        }

        System.out.println(sb);
    }
}
