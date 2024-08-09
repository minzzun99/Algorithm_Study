package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1240_노드사이의거리 {
    private static ArrayList<Node>[] adjList;
    private static final int INF = Integer.MAX_VALUE;
    private static int[] dist;
    private static int N, M;

    private static class Node {
        int idx;
        int dist;

        Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(end, dist));
            adjList[end].add(new Node(start, dist));
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int result = bfs(s, e);
            if (result == INF) {
                sb.append(0).append('\n');
            } else {
                sb.append(bfs(s, e)).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static int bfs(int start, int end) {
        Deque<Integer> deque = new ArrayDeque<>();
        dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;
        deque.add(start);

        while (!deque.isEmpty()) {
            int now = deque.poll();
            if (now == end) {
                break;
            }
            for (Node next : adjList[now]) {
                if (dist[next.idx] == INF) {
                    dist[next.idx] = dist[now] + next.dist;
                    deque.add(next.idx);
                }
            }
        }
        return dist[end];
    }
}
