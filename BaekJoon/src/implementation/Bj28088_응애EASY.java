package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj28088_응애EASY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] arr = new boolean[N];
        for (int i = 0; i < M; i++) {
            int idx = Integer.parseInt(br.readLine());
            arr[idx] = true;
        }
        while (K-- > 0) {
            boolean[] nowArr = new boolean[N];
            for (int i = N; i < 2 * N; i++) {
                int before = (i - 1) % N;
                int now = i % N;
                int next = (i + 1) % N;
                if (arr[before] && arr[next]) {
                    nowArr[now] = false;
                } else if ((arr[before] && !arr[next]) || !arr[before] && arr[next]) {
                    nowArr[now] = true;
                } else {
                    nowArr[now] = false;
                }
            }
            arr = nowArr;
        }

        int count = 0;
        for (boolean b : arr) {
            if (b) {
                count++;
            }
        }
        System.out.println(count);
    }
}
