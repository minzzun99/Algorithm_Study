package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1220_Magnetic {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;
    private static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int tc = 1; tc <= T; tc++) {
            int length = Integer.parseInt(br.readLine());
            arr = new int[length][length];

            for (int i = 0; i < length; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(String.format(PRINT, tc, countDeadLock()));
        }

        System.out.println(sb);
    }

    private static int countDeadLock() {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 1) {
                    flag = true;
                } else if (arr[j][i] == 2 && flag) {
                    count++;
                    flag = false;
                }
            }
        }

        return count;
    }
}
