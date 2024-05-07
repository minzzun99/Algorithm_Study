package ch12_backtracking;

public class Problem46 {
    private static int N;
    private static int[] arr;
    private static int answer = 0;

    public int solution(int n) {
        N = n;
        arr = new int[n];
        NQueen(0);
        return answer;
    }

    private static void NQueen(int depth) {
        if (depth == N) {
            answer++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (possible(depth)) {
                NQueen(depth + 1);
            }
        }

    }

    private static boolean possible(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}
