package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1204_최빈수구하기 {
    public static final String PRINT = "#%d %d%n";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr;

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int num = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine(), " ");
            arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }

            int maxNUmber = 0;
            int maxCount = 0;
            for (int i = 1; i <= 100; i++) {
                if (maxCount <= arr[i]) {
                    maxCount = arr[i];
                    maxNUmber = i;
                }
            }

            sb.append(String.format(PRINT, tc, maxNUmber));
        }

        System.out.println(sb);
    }
}
