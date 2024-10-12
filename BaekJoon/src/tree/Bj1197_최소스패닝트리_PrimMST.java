package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Bj1197_최소스패닝트리_PrimMST {
    private static int V, E;
    private static ArrayList<Node>[] adjList;
    private static boolean[] visited;

    private static class Node {
        int nextNode;
        int cost;

        Node(int nextNode, int cost) {
            this.nextNode = nextNode;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        visited = new boolean[V + 1];
        adjList = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            adjList[start].add(new Node(end, cost));
            adjList[end].add(new Node(start, cost));
        }

        System.out.println(bfs(1));
    }

    private static int bfs(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> {
            return Integer.compare(o1.cost, o2.cost);}
        );
        pq.add(new Node(start, 0));
        int cost = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (visited[now.nextNode]) {
                continue;
            }

            visited[now.nextNode] = true;
            cost += now.cost;

            for (Node next : adjList[now.nextNode]) {
                if (!visited[next.nextNode]) {
                    pq.add(next);
                }
            }
        }

        return cost;
    }
}
