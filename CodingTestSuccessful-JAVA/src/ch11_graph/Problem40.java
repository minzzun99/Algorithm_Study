package ch11_graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Problem40 {
    private static class Node {
        int dest;
        int cost;
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public int solution(int N, int[][] road, int K) {
        List<Node>[] adjList = new ArrayList[N + 1];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < road.length; i++) {
            adjList[road[i][0]].add(new Node(road[i][1], road[i][2]));
            adjList[road[i][1]].add(new Node(road[i][0], road[i][2]));
        }

        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.cost, o2.cost));
        pq.add(new Node(1, dist[1]));

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

        int count = 0;
        for (int i : dist) {
            if (i <= K) {
                count++;
            }
        }

        return count;
    }
}
