package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj13496_The_Merchant_of_Venice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int K = Integer.parseInt(br.readLine());
        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int[] dArr = new int[n];
            int[] vArr = new int[n];

            int sum = 0;
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                dArr[j] = Integer.parseInt(st.nextToken());
                vArr[j] = Integer.parseInt(st.nextToken());
                if (s * d >= dArr[j]) {
                    sum += vArr[j];
                }
            }

            sb.append(String.format("Data Set %d:%n%d%n%n", i, sum));
        }
        System.out.println(sb);
    }
}
