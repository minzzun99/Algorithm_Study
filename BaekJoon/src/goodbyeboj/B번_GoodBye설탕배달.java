package goodbyeboj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B번_GoodBye설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long maxA = 0, maxB = 0, maxC = 0;
            boolean flag = true;
            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                long p = Long.parseLong(st.nextToken());

                maxA = Math.max(maxA, a);
                maxB = Math.max(maxB, b);
                maxC = Math.max(maxC, c);

                long time = i + maxA + maxB + maxC;
                if (time > p) {
                    flag = false;
                }
            }

            if (flag) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.print(sb);
    }
}
