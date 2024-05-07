package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj15654_N과M_5 {
    private static int N, M;
    private static int[] result;
    private static boolean[] visited;
    private static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        visited = new boolean[N];
        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        selectNum(0);
        System.out.println(sb);
    }

    private static void selectNum(int depth) {
        if (depth == M) {
            for (int i : result) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                selectNum(depth + 1);
                visited[i] = false;
            }
        }
    }
}
