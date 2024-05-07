package ch11_graph;

public class Problem38 {
    static int[][] computer;
    static boolean[] visited;
    private static void dfs(int now) {
        visited[now] = true;
        for (int i = 0; i < computer[now].length; i++) {
            if (!visited[i] && computer[now][i] == 1) {
                dfs(i);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        computer = computers;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;       //dfs를 몇번 했는지를 알아야하기때문에
            }
        }
        return answer;
    }
}
