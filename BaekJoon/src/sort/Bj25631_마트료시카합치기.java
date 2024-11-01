package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj25631_마트료시카합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int value = 0;
        boolean[] check = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (check[i]) {
                continue;
            }
            value = arr[i];

            for (int j = i + 1; j < N; j++) {
                if (!check[j] && arr[j] > value) {
                    value = arr[j];
                    check[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
