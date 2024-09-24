package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj1246_온라인판매 {
    private static int sum = 0;
    private static int maxPrice = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int price = arr[i];
            int now = 0;

            if (M - i < N) {
                now = price * (M - i);
            } else {
                now = price * N;
            }

            if (now > sum) {
                sum = now;
                maxPrice = price;
            }
        }

        sb.append(maxPrice).append(' ').append(sum);
        System.out.println(sb);
    }
}
