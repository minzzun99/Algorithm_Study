package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj11497_통나무건너뛰기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[] arr;
        int[] result;
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            arr = new int[N];
            result = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int left = 0;
            int right = N-1;
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    result[left] = arr[i];
                    left++;
                } else {
                    result[right] = arr[i];
                    right--;
                }
            }
            int answer = Math.abs(result[0] - result[N - 1]);
            for (int i = 1; i < N; i++) {
                answer = Math.max(answer, Math.abs(result[i] - result[i - 1]));
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}
