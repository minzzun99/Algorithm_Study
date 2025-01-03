package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1002_터렛 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(getResult(x1, y1, r1, x2, y2, r2)).append('\n');
        }
        System.out.println(sb);
    }

    private static int getResult(int x1, int y1, int r1, int x2, int y2, int r2) {
        double d = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if (x1 == x2 && y1 == y2) {
            if (r1 == r2) {
                return -1;
            }
            return 0;
        } else {
            if (r1 + r2 < d || Math.pow((r1 - r2), 2) > d * d) {
                return 0;
            } else if (r1 + r2 == d || Math.pow((r1 - r2), 2) == d * d) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
