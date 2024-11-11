package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Bj18126_너구리구구 {
    private static class Node {
        int dest;
        long cost;

        Node(int dest, long cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    private static List<Node>[] adjList;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }
        visited = new boolean[N + 1];

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            adjList[start].add(new Node(end, cost));
            adjList[end].add(new Node(start, cost));
        }

        long max = bfs(1);
        System.out.println(max);
    }

    private static long bfs(int start) {
        Deque<Node> deque = new ArrayDeque<>();
        deque.add(new Node(start, 0));
        visited[start] = true;
        long totalCost = 0;

        while (!deque.isEmpty()) {
            Node now = deque.poll();

            for (Node next : adjList[now.dest]) {
                if (!visited[next.dest]) {
                    long sum = now.cost + next.cost;
                    deque.add(new Node(next.dest, sum));
                    visited[next.dest] = true;
                    totalCost = Math.max(totalCost, sum);
                }
            }
        }

        return totalCost;
    }
}
