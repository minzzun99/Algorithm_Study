package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj24444_bfs1 {
    private static int N, M, R, count;
    private static int[] visited;
    private static ArrayList<Integer>[] adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());       // 정점의 수
        M = Integer.parseInt(st.nextToken());       // 간선의 수
        R = Integer.parseInt(st.nextToken());       // 시작 정점

        adjList = new ArrayList[N + 1];
        visited = new int[N + 1];
        count = 1;
        for (int i = 1; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adjList[u].add(v);
            adjList[v].add(u);
        }

        for (int i = 1; i < adjList.length; i++) {
            Collections.sort(adjList[i]);
        }

        bfs(R);
        for (int i = 1; i < visited.length; i++) {
            sb.append(visited[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        visited[start] = count;
        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int next : adjList[now]) {
                if (visited[next] == 0) {
                    count++;
                    deque.add(next);
                    visited[next] = count;
                }
            }
        }
    }
}
