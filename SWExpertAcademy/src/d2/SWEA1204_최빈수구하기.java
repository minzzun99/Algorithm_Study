package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SWEA1204_최빈수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[] arr;

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int testNumber = Integer.parseInt(br.readLine());
            arr = new int[101];
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 1000; i++) {
                int score = Integer.parseInt(st.nextToken());
                arr[score]++;
            }

            int max = 0;
            int result = 0;

            for (int i = 0; i <= 100; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                    result = i;
                }
            }

            sb.append("#").append(testNumber).append(" ").append(result).append('\n');
        }

        System.out.println(sb);
    }
}
