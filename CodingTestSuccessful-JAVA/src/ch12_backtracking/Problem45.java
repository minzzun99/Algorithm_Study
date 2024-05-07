package ch12_backtracking;

public class Problem45 {
    private static int[][] Dungeons;
    private static int answer;
    private static boolean[] visited;

    private static void backtrak(int k, int cnt) {
        for (int i = 0; i < Dungeons.length; i++) {
            // 현재피로도가 i번째 던전의 최소피로도보다 크거나 같고
            // i번째 던전을 방문한 적이 없다면
            if (!visited[i] && Dungeons[i][0] <= k) {
                visited[i] = true;      // i번째 던전 방문처리
                // 현재까지의 최대 탐험 가능 던전 수와
                // i번째 던전에서 이동할 수 있는 최대 탐험 가능 던전 수 중 큰 값을 선택하여 업데이트
                backtrak(k - Dungeons[i][1], cnt + 1);
                answer = Math.max(answer, cnt + 1);
                visited[i] = false;
            }
        }
    }

    public int solution(int k, int[][] dungeons) {
        answer = 0;
        Dungeons = dungeons;
        visited = new boolean[dungeons.length];

        backtrak(k, 0);
        return answer;
    }
}
