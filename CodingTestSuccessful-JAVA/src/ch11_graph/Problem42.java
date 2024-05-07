package ch11_graph;

import java.util.ArrayList;

public class Problem42 {
    private static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static int N, answer;

    public int solution(int n, int[][] wires) {
        N = n;
        answer = n - 1;

        adjList = new ArrayList[n + 1];
        for (int i = 1; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int[] wire : wires) {
            adjList[wire[0]].add(wire[1]);
            adjList[wire[1]].add(wire[0]);
        }

        visited = new boolean[n + 1];

        dfs(1);
        return answer;
    }

    private static int dfs(int x) {
        visited[x] = true;
        // 자식 노드의 수
        int sum = 0;
        for (int next : adjList[x]) {
            if (!visited[next]) {
                // (전체 노드 - 자식 트리의 노드 수) - (자식 트리의 노드 수) 의 절대값이 가장 작은 값
                int count = dfs(next);
                answer = Math.min(answer, Math.abs(N - count * 2));
                sum += count;
            }
        }
        return sum + 1;
    }
}
