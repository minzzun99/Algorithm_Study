package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30406_산타춘배의선물나눠주기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numCount = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            numCount[num]++;
        }

        int[][] sumCase = {{0, 3, 3}, {1, 2, 3},
                {0, 2, 2}, {1, 3, 2},
                {0, 1, 1}, {2, 3, 1}};

        int result = 0;
        for (int[] sum : sumCase) {
            if (numCount[sum[0]] == 0 || numCount[sum[1]] == 0) {
                continue;
            }
            int minCount = Math.min(numCount[sum[0]], numCount[sum[1]]);
            result += sum[2] * minCount;
            numCount[sum[0]] -= minCount;
            numCount[sum[1]] -= minCount;
        }
        System.out.println(result);
    }
}
