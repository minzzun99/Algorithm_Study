package prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj12841_정보대등산_누적합사용 {
    static long minValue = Long.MAX_VALUE;
    static int num = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] crossArr = new int[N];
        int[] leftArr = new int[N - 1];
        int[] rightArr = new int[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            crossArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {
            leftArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {
            rightArr[i] = Integer.parseInt(st.nextToken());
        }

        long[] leftPreFixArr = new long[N];
        long[] rightPreFixArr = new long[N];

        for (int i = 1; i < N; i++) {
            leftPreFixArr[i] = leftPreFixArr[i - 1] + leftArr[i - 1];
        }
        for (int i = N - 2; i >= 0; i--) {
            rightPreFixArr[i] = rightPreFixArr[i + 1] + rightArr[i];
        }

        for (int i = 0; i < N; i++) {
            long min = crossArr[i] + leftPreFixArr[i] + rightPreFixArr[i];
            if (min < minValue) {
                minValue = min;
                num = i + 1;
            }
        }

        sb.append(num).append(' ').append(minValue);
        System.out.println(sb);
    }
}