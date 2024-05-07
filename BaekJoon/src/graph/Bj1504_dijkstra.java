package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Bj1504_dijkstra {
    public static class Node {
        int dest;
        int cost;
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
/*        public int compareTo(Node o) {
            return this.cost - o.cost;
        }*/
    }

    public static int n, e;
    public static List<Node>[] adjList;
    static final int INF = 200000000;

    public static int distance(int start, int end) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        pq.add(new Node(start, dist[start]));

        while (!pq.isEmpty()) {
            Node now = pq.poll();
            if (dist[now.dest] < now.cost) {
                continue;
            }
            for (Node next : adjList[now.dest]) {
                if (dist[next.dest] > now.cost + next.cost) {
                    dist[next.dest] = now.cost + next.cost;
                    pq.add(new Node(next.dest, dist[next.dest]));
                }
            }
        }
        return dist[end];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        adjList = new ArrayList[n + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adjList[a].add(new Node(b, w));
            adjList[b].add(new Node(a, w));
        }

        st = new StringTokenizer(br.readLine(), " ");
        int v1 = Integer.parseInt(st.nextToken());
        int v2 = Integer.parseInt(st.nextToken());

        // 1 -> v1 -> v2 -> N으로 가는 경우
        int result1 = 0;
        result1 += distance(1, v1);
        result1 += distance(v1, v2);
        result1 += distance(v2, n);

        // 1 -> v2 -> v1 -> N으로 가는 경우
        int result2 = 0;
        result2 += distance(1, v2);
        result2 += distance(v2, v1);
        result2 += distance(v1, n);

        int answer = (result1 >= INF && result2 >= INF) ? -1 : Math.min(result1, result2);
        System.out.println(answer);
    }
}
