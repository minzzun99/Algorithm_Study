package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Bj1446_지름길 {
    private static int N, D;
    private static int[] dist;
    private static ArrayList<Node>[] adjList;

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
        D = Integer.parseInt(st.nextToken());
        dist = new int[10001];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = i;
        }

        adjList = new ArrayList[10001];
        for (int i = 0; i < dist.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int dest = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adjList[start].add(new Node(dest, cost));
        }

        dijkstra(0);
        System.out.println(dist[D]);
    }

    private static void dijkstra(int start) {
        if (start > D) {
            return;
        }

        if (dist[start + 1] > dist[start] + 1) {
            dist[start + 1] = dist[start] + 1;
        }

        for (Node next : adjList[start]) {
            if (dist[next.dest] > dist[start] + next.cost) {
                dist[next.dest] = dist[start] + next.cost;
            }
        }
        dijkstra(start + 1);
    }
}
