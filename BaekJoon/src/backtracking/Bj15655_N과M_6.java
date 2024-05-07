package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj15655_N과M_6 {
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
        selectNum(0, 0);
        System.out.println(sb);
    }

    private static void selectNum(int start, int depth) {
        if (depth == M) {
            for (int i : result) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < N; i++) {
            result[depth] = arr[i];
            selectNum(i + 1, depth + 1);
        }
    }
}
