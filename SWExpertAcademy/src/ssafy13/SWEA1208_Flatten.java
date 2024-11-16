package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA1208_Flatten {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr;

        for (int tc = 1; tc <= T; tc++) {
            int count = Integer.parseInt(br.readLine());
            arr = new int[100];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(String.format(PRINT, tc, dumpBox(arr, count)));
        }

        System.out.println(sb);
    }

    private static int dumpBox(int[] arr, int count) {
        for (int i = 0; i < count; i++) {
            Arrays.sort(arr);
            arr[0]++;
            arr[arr.length - 1]--;
        }

        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }
}
