package ssafy13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA1206_View {
    private static final String PRINT = "#%d %d%n";
    private static final int T = 10;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr;

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            sb.append(String.format(PRINT, tc, countView(arr)));
        }

        System.out.println(sb);
    }

    private static int countView(int[] arr) {
        int count = 0;
        for (int i = 2; i < arr.length - 2; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i - 2] && arr[i] > arr[i + 1] && arr[i] > arr[i + 2]) {
                int max = Math.max(Math.max(arr[i - 1], arr[i - 2]), Math.max(arr[i + 1], arr[i + 2]));
                count += arr[i] - max;
            }
        }

        return count;
    }
}
