package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1083_소트 {
    private static int[] arr;
    private static int N, S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        S = Integer.parseInt(br.readLine());
        sort();
        System.out.println(toString(arr));
    }

    private static void sort() {
        for (int i = 0; i < N; i++) {
            int max = arr[i];
            int idx = i;
            for (int j = i + 1; j <= i + S; j++) {
                if (j == N) break;
                if (max < arr[j]) {
                    max = arr[j];
                    idx = j;
                }
            }

            if (idx != i) {
                for (int j = idx; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i] = max;
                S -= (idx - i);
            }

            if (S == 0) break;
        }
    }

    private static String toString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(' ');
        }
        return sb.toString();
    }
}
