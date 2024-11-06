package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj22970_문제재탕 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 1;
        for (int i = 0; i < N; i++) {
            int j = i;
            while (j + 1 < N && arr[j] < arr[j + 1]) {
                j++;
            }

            int k = j;
            while (k + 1 < N && arr[k] > arr[k + 1]) {
                k++;
            }

            max = Math.max(max, k - i + 1);
        }

        System.out.println(max);
    }
}
