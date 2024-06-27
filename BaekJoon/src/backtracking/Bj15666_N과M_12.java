package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj15666_N과M_12 {
    private static int N, M;
    private static int[] arr;
    private static int[] resultArr;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        resultArr = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0, 0);
        System.out.println(sb);
    }

    private static void dfs(int start, int depth) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                sb.append(resultArr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        int before = -1;
        for (int i = start; i < N; i++) {
            int now = arr[i];
            if (before != now) {
                before = now;
                resultArr[depth] = arr[i];
                dfs(i, depth + 1);
            }
        }
    }
}
