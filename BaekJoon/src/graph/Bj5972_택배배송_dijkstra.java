package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj5972_택배배송_dijkstra {
    private static int N, M;
    private static final int INF = Integer.MAX_VALUE;
    private static ArrayList<Node>[] adjList;
    private static int[] dist;

    private static class Node {
        int dest;
        int cost;

        Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dist = new int[N + 1];
        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(end, cost));
            adjList[end].add(new Node(start, cost));
        }
        dijkstra(new Node(1, 0));
        System.out.println(dist[N]);
    }

    private static void dijkstra(Node start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        Arrays.fill(dist, INF);
        pq.add(start);
        dist[start.dest] = start.cost;

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > dist[now.dest] + next.cost) {
                    dist[next.dest] = dist[now.dest] + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }
    }
}
