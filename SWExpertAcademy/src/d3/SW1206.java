package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 1; i <= 10; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int sum = 0;
            for (int j = 2; j < n - 1; j++) {
                if (arr[j] > arr[j - 1] && arr[j] > arr[j - 2] && arr[j] > arr[j + 1] && arr[j] > arr[j + 2]) {
                    int left = Math.max(arr[j - 1], arr[j - 2]);
                    int right = Math.max(arr[j + 1], arr[j + 2]);
                    int top = Math.max(left, right);
                    sum += arr[j] - top;
                }
            }
            sb.append("#").append(i).append(" ").append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
