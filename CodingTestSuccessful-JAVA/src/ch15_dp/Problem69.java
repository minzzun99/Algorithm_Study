package ch15_dp;

public class Problem69 {
    private static int solution(int[][] arr) {
        int n = arr[0].length;
        int[][] dp = new int[4][n];     // 조건이 4가지라서 4행
        dp[0][0] = arr[0][0];       // 상단
        dp[1][0] = arr[1][0];       // 중앙
        dp[2][0] = arr[2][0];       // 하단
        dp[3][0] = arr[0][0] + arr[2][0];       // 위, 아래

        for (int i = 1; i < n; i++) {
            // 패턴이 0이 선택된 경우, 이전 열은 패턴 1, 2 가능
            dp[0][i] = arr[0][i] + Math.max(dp[1][i - 1], dp[2][i - 1]);
            // 패턴 1이 선택된 경우, 이전 열은 패턴 0,2,3 가능
            dp[1][i] = arr[1][i] + Math.max(dp[0][i - 1], Math.max(dp[2][i - 1], dp[3][i - 1]));
            // 패턴 2가 선택된 경우, 이전 열은 0, 1 가능
            dp[2][i] = arr[2][i] + Math.max(dp[0][i - 1], dp[1][i - 1]);
            // 패턴 3이 선택된 경우, 이전 열은 1 가능
            dp[3][i] = arr[0][i] + arr[2][i] + dp[1][i - 1];
        }
        return Math.max(Math.max(dp[0][n - 1], dp[1][n - 1]), (Math.max(dp[2][n - 1], dp[3][n - 1])));
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 3, 2},
                {2, 1, 4, 1},
                {1, 5, 2, 3}};
        System.out.println(solution(arr));
    }
}
