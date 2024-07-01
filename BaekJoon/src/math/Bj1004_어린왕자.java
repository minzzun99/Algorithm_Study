package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1004_어린왕자 {
    private static int startX, startY, destX, destY;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            startX = Integer.parseInt(st.nextToken());
            startY = Integer.parseInt(st.nextToken());
            destX = Integer.parseInt(st.nextToken());
            destY = Integer.parseInt(st.nextToken());

            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                int cx = Integer.parseInt(st.nextToken());
                int cy = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                if (isPossible(cx, cy, r)) {
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        System.out.println(sb);
    }

    private static boolean isPossible(int cx, int cy, int r) {
        boolean startInside = Math.pow(startX - cx, 2) + Math.pow(startY - cy, 2) < Math.pow(r, 2);
        boolean destInside = Math.pow(destX - cx, 2) + Math.pow(destY - cy, 2) < Math.pow(r, 2);
        return startInside != destInside;
    }
}
