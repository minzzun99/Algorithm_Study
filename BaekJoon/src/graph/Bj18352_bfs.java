package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj18352_bfs {
    public static ArrayList<Integer>[] adjList;
    private static boolean[] visited;
    private static int[] answer;

    private static void bfs(int x) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(x);
        visited[x] = true;
        answer[x] = 0;

        while (!deque.isEmpty()) {
            int now = deque.poll();
            for (int i : adjList[now]) {
                if (!visited[i]) {
                    deque.add(i);
                    visited[i] = true;
                    answer[i] = answer[now] + 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());       // 최단 거리가 k 인것
        int x = Integer.parseInt(st.nextToken());       // 출발 도시

        visited = new boolean[n + 1];
        answer = new int[n + 1];
        adjList = new ArrayList[n + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adjList[start].add(end);
        }
        bfs(x);

        int count = 0;
        for (int i = 1; i < answer.length; i++) {
            if (answer[i] == k) {
                sb.append(i).append('\n');
            } else {
                count++;
            }
        }
        if (count == n) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
