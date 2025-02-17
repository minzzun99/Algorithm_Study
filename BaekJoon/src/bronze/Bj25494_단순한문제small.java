package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj25494_단순한문제small {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i = 1; i <= x; i++) {
                for (int j = 1; j <= y; j++) {
                    for (int k = 1; k <= z; k++) {
                        if (i % j == j % k && j % k == k % i && i % j == k % i) {
                            count++;
                        }
                    }
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
