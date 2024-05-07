package ch11_graph;

import java.util.ArrayList;

public class Problem34 {
    // 인접 리스트를 저장할 ArrayList 배열
    private static ArrayList<Integer>[] adjList;        //ArrayList로 배열을 만든다

    // 방문여부 저장할 boolen 배열
    private static boolean[] visited;
    // 탐색 순서 저장 배열
    private static ArrayList<Integer> answer;

    public static int[] solution(int[][] graph, int start, int n) {
        adjList = new ArrayList[n + 1];

        // 인접 리스트 초기화
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 그래프를 인접리스트로 변환
        for (int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }
        dfs(start);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void dfs(int now) {
        visited[now] = true;
        answer.add(now);

        //현재 노드와 인접한 노드 순회
        for (int next : adjList[now]) {
            if (!visited[next]) {
                dfs(next);
            }
        }

    }
}
