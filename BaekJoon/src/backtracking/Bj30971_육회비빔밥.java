package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj30971_육회비빔밥 {
    private static int N, K;
    private static int[] A, B, C;
    private static boolean[] visited;
    private static int max = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        A = new int[N];
        B = new int[N];
        C = new int[N];
        visited = new boolean[N];

        StringTokenizer stA = new StringTokenizer(br.readLine(), " ");
        StringTokenizer stB = new StringTokenizer(br.readLine(), " ");
        StringTokenizer stC = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
            B[i] = Integer.parseInt(stB.nextToken());
            C[i] = Integer.parseInt(stC.nextToken());
        }

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            dfs(1, A[i], C[i], 0);
            visited[i] = false;
        }

        System.out.println(max);
    }

    private static void dfs(int depth, int prevA, int prevC, int sum) {
        if (depth == N) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i] && prevC * C[i] <= K) {
                visited[i] = true;
                dfs(depth + 1, A[i], C[i], sum + (prevA * B[i]));
                visited[i] = false;
            }
        }
    }
}
