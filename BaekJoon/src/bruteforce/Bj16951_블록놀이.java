package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj16951_블록놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] block = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < block.length; i++) {
            block[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int[] arr = new int[N];
            arr[i] = block[i];
            boolean flag = true;
            for (int j = i - 1; j >= 0; j--) {
                arr[j] = arr[j + 1] - K;
                if (arr[j] <= 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int j = i + 1; j < N; j++) {
                    arr[j] = arr[j - 1] + K;
                }
                int count = 0;
                for (int j = 0; j < N; j++) {
                    if (block[j] != arr[j]) {
                        count++;
                    }
                }
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }
}
