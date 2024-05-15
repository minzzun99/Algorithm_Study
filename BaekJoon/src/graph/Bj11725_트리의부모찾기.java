package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Bj11725_트리의부모찾기 {
    private static int[] parent;
    private static boolean[] visited;
    private static ArrayList<Integer>[] adjList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());    // 노드의 개수
        parent = new int[N + 1];
        visited = new boolean[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 0; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adjList[a].add(b);
            adjList[b].add(a);
        }

        bfs();
        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }

    private static void bfs() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        visited[1] = true;
        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int next : adjList[now]) {
                if (!visited[next]) {
                    visited[next] = true;
                    deque.add(next);
                    parent[next] = now;
                }
            }
        }
    }
}
