package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW1859 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            //배열에 값 넣기
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long max = 0;
            long result = 0;

            for (int i = arr.length - 1; i >= 0; i--) {
                if(arr[i] > max) {
                    max = arr[i];
                } else {
                    result += max - arr[i];
                }
            }
            sb.append('#').append(tc).append(" ").append(result).append('\n');

        }
        System.out.println(sb);
    }
}
