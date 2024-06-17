package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj31589_포도주시음 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] taste = new int[N + 1];
        st = new StringTokenizer(br.readLine(), " ");
        taste[0] = 0;
        for (int i = 1; i <= N; i++) {
            taste[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(taste);
        int start = 0;
        int end = taste.length - 1;
        int count = 0;
        long answer = 0;
        while (K > count) {
            if (count % 2 == 1) {
                start++;
            } else {
                answer += taste[end] - taste[start];
                end--;
            }
            count++;
        }
        System.out.println(answer);
    }
}
