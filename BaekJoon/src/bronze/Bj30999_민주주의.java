package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30999_민주주의 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        while (N-- > 0) {
            String input = br.readLine();
            int count = 0;
            for (int i = 0; i < M; i++) {
                char c = input.charAt(i);
                if (c == 'O') {
                    count++;
                }
            }

            if (count >= (M / 2 + 1)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
