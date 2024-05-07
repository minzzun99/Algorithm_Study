package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj9663_NQueen {
    static int[] arr;
    static int N;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        N = n;
        arr = new int[n];
        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {
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

    public static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            // 같은 행에 있을 때
            if (arr[i] == arr[col]) {
                return false;
            }
            // 대각선에 있을 때
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
