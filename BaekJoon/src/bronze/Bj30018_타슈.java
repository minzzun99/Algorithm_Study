package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bj30018_타슈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> before = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            before.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        List<Integer> after = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            after.add(Integer.parseInt(st.nextToken()));
        }

        int result = 0;
        for (int i = 0; i < N; i++) {
            result += Math.abs(before.get(i) - after.get(i));
        }

        System.out.println(result / 2);
    }
}
