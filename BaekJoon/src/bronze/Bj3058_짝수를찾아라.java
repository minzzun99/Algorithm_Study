package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Bj3058_짝수를찾아라 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        List<Integer> list;

        StringTokenizer st;
        while (T-- > 0) {
            list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            for (int i = 0; i < 7; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 0) {
                    list.add(num);
                    sum += num;
                }
            }

            Collections.sort(list);
            sb.append(sum).append(" ").append(list.get(0)).append("\n");
        }

        System.out.println(sb);
    }
}
