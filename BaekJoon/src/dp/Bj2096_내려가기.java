package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj2096_내려가기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] maxDp = new int[3];
        int[] minDp = new int[3];

        StringTokenizer st;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if (i == 0) {
                maxDp[0] = minDp[0] = x;
                maxDp[1] = minDp[1] = y;
                maxDp[2] = minDp[2] = z;
            } else {
                int prevMaxX = maxDp[0];
                int prevMaxY = maxDp[1];
                int prevMaxZ = maxDp[2];

                maxDp[0] = Math.max(prevMaxX, prevMaxY) + x;
                maxDp[1] = Math.max(prevMaxX, Math.max(prevMaxY, prevMaxZ)) + y;
                maxDp[2] = Math.max(prevMaxY, prevMaxZ) + z;

                int prevMinX = minDp[0];
                int prevMinY = minDp[1];
                int prevMinZ = minDp[2];

                minDp[0] = Math.min(prevMinX, prevMinY) + x;
                minDp[1] = Math.min(prevMinX, Math.min(prevMinY, prevMinZ)) + y;
                minDp[2] = Math.min(prevMinY, prevMinZ) + z;
            }
        }

        int max = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
        int min = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));

        System.out.println(max + " " + min);
    }
}
