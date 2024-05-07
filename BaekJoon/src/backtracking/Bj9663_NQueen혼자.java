package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9663_NQueen혼자 {
    private static int[] arr;
    private static int N;
    private static int count = 0;

    private static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[i] == arr[col]) {
                return false;
            } else if (Math.abs(arr[col] - arr[i]) == Math.abs(col - i)) {
                return false;
            }
        }
        return true;
    }

    private static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                dfs(depth + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }
}
